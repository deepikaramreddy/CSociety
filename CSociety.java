import java.util.*;
class CSociety {  
    int n, f, r, ctr;
    int arr[];
    public CSociety (int n) { 
      this.n = n;
      arr = new int[n];
      f=0;
      r=0;
      ctr=0;
    }
    public void enqueue(int d)
    {
      if (ctr==n) {
        System.out.println("HOUSEFULL..!");
        return;
      }
      arr[r] = d;
      r=(r+1)%n;
      ctr++;
      System.out.println("FOOD GIVEN SUCCESSFULLY!");
    }
    public void dequeue() {
      if (ctr == 0) {
        System.out.println("NO EMPTY PLATES!");
      } else {
        System.out.println("FOOD PLATE TAKEN FROM HOUSE NO :" +f);
        f=(f+1)%n;
      }
    }
    public void display() {
      for (int i=f,j=0;j<ctr;j++) {
        System.out.println("House Number :" +i);
        i=(i+1)%n;
      }
    }
    public static void main(String[] args) {
      CSociety obj = new CSociety(10);
      while(true) {
        try {
          
            System.out.println("1. Provide Food");
            System.out.println("2. Take Plate");
            System.out.println("3. Display House with food");
            System.out.println("4. Quit");
            System.out.println("Enter your choice : ");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            switch(ch) 
            {
              case 1: 
                obj.enqueue(1);
                break;
              case 2:
                obj.dequeue();
                break;
              case 3:
                obj.display();
                break;
              case 4:
                System.exit(0);
            }
          } catch(Exception e) {
            System.out.println("Wrong Input..!");
        }
      }
    }
  }
