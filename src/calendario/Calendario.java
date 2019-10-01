/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendario;

import java.util.Scanner;

/**
 *
 * @author Douglas.Sierra
 */
public class Calendario {

    
    
    public static int [] months = {31,28,31,30,31,30,31,31,30,31,30,31};
    public static int startyear = 1900;
    public static int Year = 0;
    
    public static void main(String[] args) {
        
        
        //Ask information to the user
        System.out.println("Introduce the month\n");
        int Month = readInt();
        System.out.println("Introduce the year\n");
        Year = readInt();
        
        //Calculate how many year there are from 1900 to the year intoduced by user
        int numYears = Numberofyear(Year);
        
        //Calcullate number of days from the 1900 to the year
        int numdays = Numberofdays(numYears);
        
        
        //System.out.println(numdays);
        
        //Calculate day of the week january first
        calculatedayenerofirst(numdays);
        
        
        //Calculate days of the present year
        int daysofpreyear = calculatedayspresentyear(Month);
        
        //calculate first day of the month
        
        
        
            
  
        
        
        
        
        
        
        
        //System.out.println(Numberofyear(Year));
        
        
    }
    
    public static int readInt(){
        int var;    
        Scanner input = new Scanner(System.in);
        var =input.nextInt();
        return var;
    }
    
    public static int Numberofyear(int year){
    
        return  year - startyear;
        
    }
    
    public static int Numberofdays(int year){
    
        int leapday= 0,numberofdays = 0;
        for(int i = 0; i< year;i++){
        
            numberofdays = 365 + numberofdays;
            leapday++;
            if(leapday == 4){
            numberofdays++;
            leapday=0;
            }
        }
        
        return  numberofdays;
        
    }
    
    public static int calculatedayenerofirst(int days){
    
        
        int varfinal=0;
        int vari=0;
        int a = 1,cont = 0;
        while(vari <days){
        
        
        if(a>6){
        
            a=0;
        }
        if(cont ==4){
        
            cont=0;
            if(a==6){
            a=0;
            }else{
            a++;
            }
            
            //System.out.println();
        }
        
        //System.out.print(a+" ");
        varfinal = a;
        a++;
        vari++;
        cont++;
        }
        
        return varfinal;
        
    }
    
    public static int calculatedayspresentyear(int month){
    
    
        //month = month -1;
        int result=0;
        for(int i = 0;i < month;i++){
        
            result = result + months[i];
        
        }
        
        if(calculateleapyear(Year)){
        result++;
        
        }
        
       
        
        
    return result;
    }
    
    public static boolean calculateleapyear(int year){
    
        boolean a = false;
    year = startyear - year;
    
    year = year % 4;
    
    if(year == 0){
    
        a = true;
    }
    return a;
    }
    
    
    public static int calculatedayofmonth(int day1, int numofdays){
    
        int dayfinal = numofdays - day1;
        
        int modulo= dayfinal % 7 ;
        
        System.out.println(dayfinal);
        System.out.println(modulo);
        
        
//        for(int i=numofdays;i>0;i-- ){
//        
//            for(int j=day1;j>0;j-- ){
//            
//            dayfinal= j;    
//            }
//        
//        }
        return dayfinal;
    
    }
}
