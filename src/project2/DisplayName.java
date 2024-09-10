package project2;
import java.util.Scanner;

public class DisplayName {
  public static void main(String[] args) {
			        System.out.println("Enter your name: ");
			        Scanner sc = new Scanner(System.in);
			        String name = sc.nextLine().toUpperCase();
			        System.out.println( name );
			        
			        System.out.println("Enter your number: ");
			        int n=sc.nextInt();
			        
			       
			        
			        
			        for(int row=1;row<=n;row++)    //for row
			        {
			        	for(int i=0;i<name.length();i++)  //for name
			        	{
			        		char ch=name.charAt(i);
			        		switch(ch){
			        		case 'A':
		                        for (int col = 1; col <= n; col++) {
		                            if (row == 1 && col > 1 && col < n || row == n / 2 || col == 1 && row > 1 || col == n && row > 1) {
		                                System.out.print("*");
		                            } else {
		                                System.out.print(" ");
		                            }
		                        }
		                        break;
		                        
			        		case 'B':
		                        for (int col = 1; col <= n; col++) {
		                            if (col == 1 || row == 1 || col==n && row<n/2|| row==n/2 && col<n-1 || col==n && row > n/2 || row==n && col< n-1) {
		                                System.out.print("*");
		                            } else {
		                                System.out.print(" ");
		                            }
		                        }
		                        break;
		                        
			        		case 'C':
		                        for (int col = 1; col <= n; col++) {
		                            if (row == 1 || row == n || col == 1) {
		                                System.out.print("*");
		                            } else {
		                                System.out.print(" ");
		                            }
		                        }
		                        break;
		                        
			        		case 'D':
		                        for (int col = 1; col <= n; col++) {
		                            if (col == 1 || (col == n && row != 1 && row != n) || (row == 1 && col != n) || (row == n && col != n)) {
		                                System.out.print("*");
		                            } else {
		                                System.out.print(" ");
		                            }
		                        }
		                        break;
		                        
			        		case 'E':
		                        for (int col = 1; col <= n; col++) {
		                            if (col == 1 || row == 1 || row == n / 2 + 1 || row == n) {
		                                System.out.print("*");
		                            } else {
		                                System.out.print(" ");
		                            }
		                        }
		                        break;

		                    case 'F':
		                        for (int col = 1; col <= n; col++) {
		                            if (col == 1 || row == 1 || row == n / 2 + 1) {
		                                System.out.print("*");
		                            } else {
		                                System.out.print(" ");
		                            }
		                        }
		                        break;

		                    case 'G':
		                        for (int col = 1; col <= n; col++) {
		                            if (row == 1 || row == n || col == 1 || (row == n / 2 + 1 && col >= n / 2) || (col == n && row >= n / 2)) {
		                                System.out.print("*");
		                            } else {
		                                System.out.print(" ");
		                            }
		                        }
		                        break;
		                        
		                    case 'H':
		                        for (int col = 1; col <= n; col++) {
		                            if (col == 1 || col == n || row == n / 2) {
		                                System.out.print("*");
		                            } else {
		                                System.out.print(" ");
		                            }
		                        }
		                        break;

		                    case 'I':
		                        for (int col = 1; col <= n; col++) {
		                            if (row == 1 || row == n || col == n / 2) {
		                                System.out.print("*");
		                            } else {
		                                System.out.print(" ");
		                            }
		                        }
		                        break;

		                    case 'J':
		                        for (int col = 1; col <= n; col++) {
		                        	 if (row == 1 || (col==n && row<n) || (row==n && col<n)) {
		                                System.out.print("*");
		                            } else {
		                                System.out.print(" ");
		                            }
		                        }
		                        break;

		                    case 'K':
		                        for (int col = 1; col <= n; col++) {
		                            if (col == 1 || col + row == n - 1 || row - col == n / 2) {
		                                System.out.print("*");
		                            } else {
		                                System.out.print(" ");
		                            }
		                        }
		                        break;

		                    case 'L':
		                        for (int col = 1; col <= n; col++) {
		                            if (col == 1 || row == n) {
		                                System.out.print("*");
		                            } else {
		                                System.out.print(" ");
		                            }
		                        }
		                        break;

		                    case 'M':
		                        for (int col = 1; col <= n; col++) {
		                            if (col == 1 || col == n || col == row && row <= n / 2 || row+col==n && col>=n/2) {
		                                System.out.print("*");
		                            } else {
		                                System.out.print(" ");
		                            }
		                        }
		                        break;
		                        
		                    case 'N':
		                        for (int col = 1; col <= n; col++) {
		                            if (col == 1 || col == n || col == row) {
		                                System.out.print("*");
		                            } else {
		                                System.out.print(" ");
		                            }
		                        }
		                        break;
		                        
		                    case 'O':
		                        for (int col = 1; col <= n; col++) {
		                            if (row == 1 || row == n || col == 1 || col == n) {
		                                System.out.print("*");
		                            } else {
		                                System.out.print(" ");
		                            }
		                        }
		                        break;
		                        
		                    case 'P':
		                        for (int col = 1; col <= n; col++) {
		                            if (col == 1 || row == 1 || col==n && row <= n / 2 || row==n/2) {
		                                System.out.print("*");
		                            } else {
		                                System.out.print(" ");
		                            }
		                        }
		                        break;
		                        
		                    case 'Q':
		                        for (int col = 1; col <= n; col++) {
		                            if (row == 1 || row == n || col == 1 || col == n || row==col && row>n/2) {
		                                System.out.print("*");
		                            } else {
		                                System.out.print(" ");
		                            }
		                        }
		                        break;
		                        
		                    case 'R':
		                        for (int col = 1; col <= n; col++) {
		                            if (col==1||col ==n/2 && row<=n/2 ||  row==1 && col<=n/2 || row==n/2 && col<=n/2 || (row-col==(n-(n/2)))  ) {
		                
		                                System.out.print("*");
		                            } else {
		                                System.out.print(" ");
		                            }
		                        }
		                        break;
		                        
		                    case 'S':
		                        for (int col = 1; col <= n; col++) {
		                            if (row == 1 || col==1 && row<=n/2 || row==n/2 || col==n && row>=n/2 || row==n ) {
		                                System.out.print("*");
		                            } else {
		                                System.out.print(" ");
		                            }
		                        }
		                        break;
		                        
		                    case 'T':
		                        for (int col = 1; col <= n; col++) {
		                            if (row == 1 || col == n / 2 + 1) {
		                                System.out.print("*");
		                            } else {
		                                System.out.print(" ");
		                            }
		                        }
		                        break;
		                        
		                    case 'U':
		                        for (int col = 1; col <= n; col++) {
		                            if (col == 1 || col == n || row == n) {
		                                System.out.print("*");
		                            } else {
		                                System.out.print(" ");
		                            }
		                        }
		                        break;
		                        
		                    case 'V':
		                        for (int col = 1; col <= n; col++) {
		                            // Diagonal lines converging to the bottom
		                            if (col == row || col == n - row + 1 || row == n) {
		                                System.out.print("*");
		                            } else {
		                                System.out.print(" ");
		                            }
		                        }
		                        break;

		                        
		                    
		                        
		                    case 'W':
		                        for (int col = 1; col <= n; col++) {
		                            if (col == 1 || col == n || row+col==n+1 && row>=n/2 || row==col && row>=n/2) {
		                                System.out.print("*");
		                            } else {
		                                System.out.print(" ");
		                            }
		                        }
		                        break;
		                        
		                    case 'X':
		                        for (int col = 1; col <= n; col++) {
		                            if (col == row || col == n - row + 1) {
		                                System.out.print("*");
		                            } else {
		                                System.out.print(" ");
		                            }
		                        }
		                        break;
		                        
		                    case 'Y':
		                        for (int col = 1; col <= n; col++) {
		                            if (row <= n / 2 && (col == row || col == n - row + 1)) {
		                                System.out.print("*");
		                            } else if (row > n / 2 && col == n / 2 + 1) {
		                                System.out.print("*");
		                            } else {
		                                System.out.print(" ");
		                            }
		                        }
		                        break;
		                        
		                    case 'Z':
		                        for (int col = 1; col <= n; col++) {
		                            if (row == 1 || row == n || col == n - row + 1) {
		                                System.out.print("*");
		                            } else {
		                                System.out.print(" ");
		                            }
		                        }
		                        break;
		                        
		                    default:
			        			for (int col = 1; col <= n; col++) 
								{
									System.out.print(" ");
				                }
				                break;
			        		}
				                System.out.print("  "); // Space between letters
					   }

					            
					            System.out.println(); // Move to the next row after printing the entire row for all characters
				   }

					        sc.close();
			   }
		}

}
