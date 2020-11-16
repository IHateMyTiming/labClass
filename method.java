public static void main(String[] args) {
    
//EdgardMethod 

    int n1 = 10;
    int n2 = 5;
    s = n1+n2;
    System.out.println(s);      
} 
public static void main(String[] args) {
    
     // LuizaMethod
    
    int num1, num2, sum;
    
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Please type a number: ");
        num1 = sc.nextInt();
        
        System.out.println("Please type another number: ");
        num2 = sc.nextInt();
        
        sc.close();
        sum = num1 + num2;
        System.out.println("Sum of these numbers: "+sum);
    }
}
