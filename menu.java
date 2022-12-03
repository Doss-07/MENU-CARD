import java.util.*;
abstract class hotel{
    abstract int menucard();
}
class menucards extends hotel{
    int net;
    int menucard(){
        Scanner s=new Scanner(System.in);
        deserts ob1=new deserts();
	System.out.println("\t\tWELCOME TO DmAcK HOTEL");
	System.out.println("\t\t\t MENU CARD");
	System.out.println("1.Drinks\n2.Food\n3.Desert");
	System.out.println("\tWhat would you like to prefer:");
	int n=s.nextInt();
	if(n==1)
	this.net=ob1.drink(net);
	else if(n==2)
	this.net=ob1.food(net);
	else if(n==3)
	this.net=ob1.desert(net);
	else
	System.out.println("Your selection is invalid\nplease enter the valid selection");
	return net;
	
    }
}
class drinks{
    int net;
    int drink(int net){
        this.net=net;
         Scanner s=new Scanner(System.in);
        int i,n,qty;
    System.out.println("Menu Card for drinks:");
	System.out.println("\tNO:\tITEM:\t\tQUANTITY:\tAMOUNT:");
	System.out.println("\t1)\tCoffee   \t1\t\t15");
	System.out.println("\t2)\tTea      \t1\t\t10");
	System.out.println("\t3)\tMilkshake\t1\t\t40");
	System.out.println("\t4)\tMilk     \t1\t\t10");
	System.out.println("\t5)\tBadammilk\t1\t\t20");
	System.out.println ("Enter the choice:");
     n=s.nextInt();
	for(i=n;i<=5;i++){
		if(i==1){
			System.out.println("Your selection is coffee:");
			System.out.println("Enter the quantity:");
			 qty=s.nextInt();
			net=net+(15*qty);
			break;
		}
		if(i==2){
			System.out.println("Your selection is tea:");
			System.out.println("Enter the quantity:");
			 qty=s.nextInt();
			net=net+(10*qty);
			break;
		}
		if(i==3){
			System.out.println("Your selection is milk shake:");
		    System.out.println("Enter the quantity:");
			 qty=s.nextInt();
			net=net+(40*qty);
			break;
		}
		if(i==4){
			System.out.println("Your selection is milk:");
			System.out.println("Enter the quantity:");
			 qty=s.nextInt();
			net=net+(10*qty);
			break;
		}
		if(i==5){
			System.out.println("Your selection is badam milk:");
			System.out.println("Enter the quantity:");
			 qty=s.nextInt();
			net=net+(20*qty);
			break;
		}
	}
	return net;
    }
}
class foods extends drinks{
    int net;
    int food(int net){
        this.net=net;
        Scanner s=new Scanner(System.in);
        int i,qty;
	System.out.println("Menu Card for foods:");
	System.out.println("\tNO:\tITEM:\t\tQUANTITY:\tAMOUNT:");
	System.out.println("\t1)\tIdly      \t1\t\t10");
	System.out.println("\t2)\tDosa      \t1\t\t20");
	System.out.println("\t3)\tParatto   \t1\t\t15");
	System.out.println("\t4)\tBriyani    \t1\t\t150");
	System.out.println("\t5)\tFried rice\t1\t\t70");
	System.out.println("Enter the choice:");
	i=s.nextInt();
    while(i==1){
			System.out.println("your selection is idly:");
			System.out.println("enter the quantity:");
			qty=s.nextInt();
			net=net+(10*qty);
			break;
		}
	while(i==2){
			System.out.println("your selection is dosa:");
			System.out.println("enter the quantity:");
			qty=s.nextInt();
			net=net+(20*qty);
			break;
		}
	while(i==3){
			System.out.println("your selection is paratto:");
			System.out.println("enter the quantity:");
			qty=s.nextInt();
			net=net+(15*qty);
			break;
		}
    while(i==4){
			System.out.println("your selection is briyani:");
			System.out.println("enter the quantity:");
			qty=s.nextInt();
			net=net+(150*qty);
			break;
		}
    while(i==5){
			System.out.println("your selection is fried rice:");
			System.out.println("enter the quantity:");
			qty=s.nextInt();
			net=net+(70*qty);
			break;
		}
	while(i>5){
		System.out.println("your selection is invalide!");
		break;
}
        return net;

    }
    int food(){
        return 0;
    }
}
class deserts extends foods{
    int net;
    int desert(int net){
        this.net=net;
        Scanner s=new Scanner(System.in);
        int order,qty,n;
	System.out.println("Menu Card for deserts:");
	System.out.println("\tNO:\tITEM:\t\tQUANTITY:\tAMOUNT:");
	System.out.println("\t1)\tIce cream \t1\t\t55");
	System.out.println("\t2)\tCake      \t1\t\t30");
	System.out.println("\t3)\tRed valvet\t1\t\t60");
	System.out.println("\t4)\tGulobjamun  \t1\t\t20");
	System.out.println("\t5)\tJilib     \t1\t\t20");
	System.out.println("Enter the choice:");
	order = s.nextInt();
	switch(order){
		case 1:
		System.out.println("Your selection is ice cream");
		System.out.println("Enter the quantity:");
		qty=s.nextInt();
		net=net+(qty*55);
		break;
		case 2:
		System.out.println("Your selection is cake");
		System.out.println("Enter the quantity:");
		qty=s.nextInt();
		net=net+(qty*30);
		break;
		case 3:
		System.out.println("Your selection is red valvet");
		System.out.println("Enter the quantity:");
		qty=s.nextInt();
		net=net+(qty*60);
		break;
		case 4:
		System.out.println("Your selection is gulabjamun");
		System.out.println("Enter the quantity:");
		qty=s.nextInt();
		net=net+(qty*20);
		break;
		case 5:
		System.out.println("\nYour selection is jilib");
		System.out.println("\nEnter the quantity:");
		qty=s.nextInt();
		net=net+(qty*20);
		break;
		default:
		System.out.println("Your selection is invalide");
	}
	return net;
    }
}
class amount{
    amount(int x){
        System.out.println("Your bill amount: "+x);
    }
    amount(){
        System.out.println("THANK  YOU! For your rating and feed back");
	System.out.println("\tPlease come again!");
        
    }
}
class Main
{
	public static void main(String[] args) {
	    menucards ob=new menucards();
    Scanner s=new Scanner(System.in);
	int x=ob.menucard();
	while(x>0){
	System.out.println("If you want to coninune press 1:");
	int n=s.nextInt();
	if(n==1)
	x=ob.menucard();
	else
	break;
	}
	amount o1=new amount(x);
	System.out.println("Enter your rating in numbers upto 5:");
    float n=s.nextFloat();
    amount o2=new amount();
	
	}
}

