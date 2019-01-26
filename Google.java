package jan23;
import java.util.Scanner;
public class Google {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("WELCOME TO YOUR SALARY SLIP PORTAL");
		System.out.print("Enter Username-");
		String un=input.next();
		System.out.println();
		System.out.print("Enter Password-");
		String pass=input.next();
		String panel[]= {"admin","admin"};
		int i=2;
		while(!un.equals(panel[0])||!pass.equals(panel[1]))
			{
				System.out.println("INVALID USERNAME OR PASSWORD. Number of tries left= "+i);
				System.out.print("Enter Username-");
				un=input.next();
				System.out.println();
				System.out.print("Enter Password-");
				pass=input.next();
				i--;
				if(i==0)
				{System.out.println("GoodBye!");System.exit(0);}
			}
		System.out.println("Enter your Employ ID to search your salary slip ");
		int empid=input.nextInt();
		String empdata1[]= {"EmpId","EmpName","Dept","Basic","HRA","IT","DA"};
		String empdata2[][]={{"101","A","e","20000","3000","1200","2200"},
				            {"102","B","s","25000","5000","2500","2500"},
				            {"103","C","k","18500","2500","1000","1800"},
				            {"104","D","p","21000","3000","1200","3200"},
				            {"105","E","m","40000","12000","1200","4000"},
				            {"106","F","s","25450","5000","3500","2500"},
				            {"107","G","e","21000","3000","2500","2200"}};
		int basic=0,hra=0,it=0,da=0;
		switch(empid)
		{
		case 101: basic=Integer.parseInt(empdata2[0][3]);
		          hra=Integer.parseInt(empdata2[0][4]);
		          it=Integer.parseInt(empdata2[0][5]);
		          da=Integer.parseInt(empdata2[0][6]);
		          break;
		case 102: basic=Integer.parseInt(empdata2[1][3]);
                  hra=Integer.parseInt(empdata2[1][4]);
                  it=Integer.parseInt(empdata2[1][5]);
                  da=Integer.parseInt(empdata2[1][6]);
                  break;
		case 103: basic=Integer.parseInt(empdata2[2][3]);
                  hra=Integer.parseInt(empdata2[2][4]);
                  it=Integer.parseInt(empdata2[2][5]);
                  da=Integer.parseInt(empdata2[2][6]);
                  break;
		case 104: basic=Integer.parseInt(empdata2[3][3]);
                  hra=Integer.parseInt(empdata2[3][4]);
                  it=Integer.parseInt(empdata2[3][5]);
                  da=Integer.parseInt(empdata2[3][6]);
                  break;
		case 105: basic=Integer.parseInt(empdata2[4][3]);
                  hra=Integer.parseInt(empdata2[4][4]);
                  it=Integer.parseInt(empdata2[4][5]);
                  da=Integer.parseInt(empdata2[4][6]);
                  break;
		case 106: basic=Integer.parseInt(empdata2[5][3]);
                  hra=Integer.parseInt(empdata2[5][4]);
                  it=Integer.parseInt(empdata2[5][5]);
                  da=Integer.parseInt(empdata2[5][6]);
                  break;
		case 107: basic=Integer.parseInt(empdata2[6][3]);
                  hra=Integer.parseInt(empdata2[6][4]);
                  it=Integer.parseInt(empdata2[6][5]);
                  da=Integer.parseInt(empdata2[6][6]);
                  break;
        default: System.out.println("Invalid EmpID");          
		}
	    int gross=basic+hra+da-it;
	    int temp=((gross*20)/100);
	    int price=0;
	    if(temp<=gross)
	    {
	    	System.out.println("Shopping");
	    	String shop[][]= {{"Jeans","5500"},{"Shirt","4000"},
	    			{"Jacket","8000"},{"Waistcoat","7500"},{"Blazer","10000"}};
            System.out.println("You can choose from the following items:-");
            for(int y=0;y<5;y++)
            {
            	System.out.println((y+1)+". "+shop[y][0]);
            }
            System.out.println("Enter your choice");
            int choice=input.nextInt();
            while(price<temp)
            {switch(choice)
            {
            case 1: System.out.println("You chose "+shop[0][0]);
            price=Integer.parseInt(shop[0][1]);
            break;
            case 2: System.out.println("You chose "+shop[1][0]);
            price=Integer.parseInt(shop[1][1]);
            break;
            case 3: System.out.println("You chose "+shop[2][0]);
            price=Integer.parseInt(shop[2][1]);
            break;
            case 4: System.out.println("You chose "+shop[3][0]);
            price=Integer.parseInt(shop[3][1]);
            break;
            case 5: System.out.println("You chose "+shop[4][0]);
            price=Integer.parseInt(shop[4][1]);
            break;
            default: System.out.println("Invalid Choice");
            }break;}
            if(price>temp)
            {
            	System.out.println("Insufficient Balance");
            }
            
         }
	    else
	    {
	    	System.out.println(temp+" Rs. have been transferred to your Savings Account.");
	    }
	  System.out.print("THANK YOU!");  
	}
}