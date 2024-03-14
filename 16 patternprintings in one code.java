import java.util.*;

class pp{
	int pattern;
	int size;
	int i,j,z;
	int ans;
	
	void rhp(int size) {						//1.right half pyramid
		for(int i=0;i<size;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	
	void lhp(int size) {					//2.left half pyramid
		for(int i=0;i<size;i++) {
			for(int j=0;j<=size-i;j++) {
				System.out.print(" ");
			}
			for(int z=0;z<=i;z++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	
	void fp(int size) {						//3.full pyramid
		for(int i=0;i<size;i++) {
			for(int j=0;j<=size-i;j++) {
				System.out.print(" ");
			}
			for(int z=0;z<=i;z++) {
				System.out.print(" *");
			}
			System.out.print("\n");
		}
	}
	
	void lrhp(int size) {					//4.inverted right half pyramid
		for(int i=0;i<size;i++) {
			for(int j=i;j<size;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	
	void llhp(int size) {					//5.inverted left half pyramid
		for(int i=0;i<size;i++) {
			for(int z=0;z<=i;z++) {
				System.out.print(" ");
			}
			for(int j=i;j<size;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	
	void lfp(int size) {					//6.inverted full pyramid
		for(int i=0;i<size;i++) {
			for(int z=0;z<=i;z++) {
				System.out.print(" ");
			}
			for(int j=i;j<size;j++) {
				System.out.print(" *");
			}
			System.out.print("\n");
		}
	}
	
	void rp(int size) {					//7.rhombus pattern
		for(int i=0;i<size;i++) {
			for(int z=0;z<=i;z++) {
				System.out.print(" ");
			}
			for(int j=0;j<size;j++) {
				System.out.print(" *");
			}
			System.out.print("\n");		}
	}
	
	void dp(int size) {					//8.diamond pattern
		for(int i=0;i<size;i++) {
			for(int j=0;j<=size-i;j++) {
				System.out.print(" ");
			}
			for(int z=0;z<=i;z++) {
				System.out.print(" *");
			}
			System.out.print("\n");
		}
		for(int i=1;i<size;i++) {
			for(int z=0;z<=i+1;z++) {
				System.out.print(" ");
			}
			for(int j=i;j<size;j++) {
				System.out.print(" *");
			}
			System.out.print("\n");
		}
	}
	
	void hp(int size) {					//9.hourglass pattern
		for(int i=0;i<size;i++) {
			for(int z=0;z<=i;z++) {
				System.out.print(" ");
			}
			for(int j=i;j<size;j++) {
				System.out.print(" *");
			}
			System.out.print("\n");
		}
		for(int i=1;i<size;i++) {
			for(int j=0;j<size-i;j++) {
				System.out.print(" ");
			}
			for(int z=0;z<=i;z++) {
				System.out.print(" *");
			}
			System.out.print("\n");
		}
	}
	
	void hsp(int size) {					//10.hollow square pattern
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(i!=0 && i!=size-1 && j!=0 && j!=size-1) {
					System.out.print("  ");
				}
				else {
				System.out.print(" *");}
			}
			System.out.print("\n");
		}
	}
	
	void hfp(int size) {						//11.hollow full pyramid
		for(int i=0;i<size;i++) {
			for(int j=0;j<=size-i;j++) {
				System.out.print(" ");
			}
			for(int z=0;z<=i;z++) {
				if(z==0 || i==size-1) {
				System.out.print(" *");}
				else {System.out.print(" ");}
			}
			if(z==0 && i!=0 && i!=size-1) {
				if(i!=1) {
				for(int g=1;g<i;g++) {
					System.out.print(" ");
				}}
				System.out.print("*");}
			System.out.print("\n");
		}
	}
	
	void hifp(int size) {					//12.hollow inverted full pyramid
		for(int i=0;i<size;i++) {
			for(int z=0;z<=i;z++) {
				System.out.print(" ");
			}
			for(int j=i;j<size;j++) {
				if(i==0 || j==size-1 ||i==j) {
				System.out.print(" *");}
				else {System.out.print("  ");}
			}
			System.out.print("\n");
		}
	}
	
	void hdp(int size) {					//13.hollow diamond pattern
		for(int i=0;i<size;i++) {
			for(int j=0;j<=size-i;j++) {
				System.out.print(" ");
			}
			for(int z=0;z<=i;z++) {
				if(z==0 || i==size-1 && z==size-1) {
				System.out.print(" *");}
				else if(i==size-1) {System.out.print("  ");}
				else {System.out.print(" ");}
			}
			if(z==0 && i!=0 && i!=size-1) {
				if(i!=1) {
				for(int g=1;g<i;g++) {
					System.out.print(" ");
				}}
				System.out.print("*");}
			System.out.print("\n");
		}
		for(int i=1;i<size;i++) {
			for(int z=0;z<=i+1;z++) {
				System.out.print(" ");
			}
			for(int j=i;j<size;j++) {
				if(i==0 || j==size-1 ||i==j) {
				System.out.print(" *");}
				else {System.out.print("  ");}
			}
			System.out.print("\n");
		}
	}
	
	void hhp(int size) {					//14.hollow hourglass pattern
		for(int i=0;i<size;i++) {
			for(int z=0;z<=i;z++) {
				System.out.print(" ");
			}
			for(int j=i;j<size;j++) {
				if(i==0 || j==size-1 ||i==j) {
				System.out.print(" *");}
				else {System.out.print("  ");}
			}
			System.out.print("\n");
		}
		for(int i=1;i<size;i++) {
			for(int j=0;j<size-i;j++) {
				System.out.print(" ");
			}
			for(int z=0;z<=i;z++) {
				if(z==0 || i==size-1) {
				System.out.print(" *");}
				else {System.out.print(" ");}
			}
			if(z==0 && i!=0 && i!=size-1) {
				if(i!=1) {
				for(int g=1;g<i;g++) {
					System.out.print(" ");
				}}
				System.out.print("*");}
			System.out.print("\n");
		}
		
	}
	
	void ft(int size) {						//15.floyd's triangle
		int num=0;
		for(int i=0;i<size;i++) {
			for(int j=0;j<=i;j++) {
				num=num+1;
				System.out.print(" "+num);
			}
			System.out.print("\n");
		}
	}
	
	private int factorial(int i)
    {
        if (i == 0)
            return 1;
        return i * factorial(i - 1);
    }
	
	void pt(int size) {						//16.pascal's triangle
		int n = size, i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j <= n - i; j++) {				// for left spacing
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {							// nCr formula
                System.out.print(" "+ factorial(i)/ (factorial(i - j)* factorial(j)));
            }
 
            System.out.println();
        }
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		pp p=new pp();
        int end=0;
		do{
        System.out.print("1.Right Half Pyramid Pattern\r\n"
				+ "2.Left Half Pyramid Pattern\r\n"
				+ "3.Full Pyramid Pattern\r\n"
				+ "4.Inverted Right Half Pyramid Pattern\r\n"
				+ "5.Inverted Left Half Pyramid Pattern\r\n"
				+ "6.Inverted Full Pyramid Pattern\r\n"
				+ "7.Rhombus Pattern\r\n"
				+ "8.Diamond Pattern\r\n"
				+ "9.Hourglass Pattern\r\n"
				+ "10.Hollow Square Pattern\r\n"
				+ "11.Hollow Full Pyramid Pattern\r\n"
				+ "12.Hollow Inverted Full Pyramid Pattern\r\n"
				+ "13.Hollow Diamond Pattern\r\n"
				+ "14.Hollow Hourglass Pattern\r\n"
				+ "15.Floyd’s Triangle Pattern\r\n"
				+ "16.Pascal’s Triangle Pattern\r\n\nEnter the S/O number to select the pattern: ");
		p.pattern=s.nextInt();
		if(p.pattern>=1 && p.pattern<=16) {
			System.out.print("Plz enter the size: ");
			p.size=s.nextInt();
		}
		switch(p.pattern){
			case 1:
				p.rhp(p.size);
				break;
			case 2:
				p.lhp(p.size);
				break;
			case 3:
				p.fp(p.size);
				break;
			case 4:
				p.lrhp(p.size);
				break;
			case 5:
				p.llhp(p.size);
				break;
			case 6:
				p.lfp(p.size);
				break;
			case 7:
				p.rp(p.size);
				break;
			case 8:
				p.dp(p.size);
				break;
			case 9:
				p.hp(p.size);
				break;
			case 10:
				p.hsp(p.size);
				break;
			case 11:
				p.hfp(p.size);
				break;
			case 12:
				p.hifp(p.size);
				break;
			case 13:
				p.hdp(p.size);
				break;
			case 14:
				p.hhp(p.size);
				break;
			case 15:
				p.ft(p.size);
				break;
			case 16:
				p.pt(p.size);
				break;
            
		}
        if( 16<p.pattern ||p.pattern<=0){
            System.out.println("Plz enter the valid number!\n");}
        else{
            System.out.println("If u want to do again press (0)\npress other key to quit");
            end=s.nextInt();}
	}while(end==0);
    }
}
