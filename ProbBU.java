import java.text.*;
import java.util.*;

class ProbBU{
    public static void main(String[] args){
        System.out.println("\n\n\n");
        System.out.println("Welcome to ProbBu\nFor the Bennettians\nBy the Bennettians\nA Platform for all your University related problems.");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------");

        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        String name = sc.next();

        //Checking for Validation of Year
        int year;
        do{
            System.out.println("Year of Study: ");
            year =sc.nextInt();
            if(year > 5){
                System.out.println();
                System.out.println("Please Enter a Valid Academic Year");
            }
            else{
                break;
            }
        }while(true);

        System.out.println("Course Name: ");
        String course = sc.next();

        System.out.println("Enrollment Number: ");
        String enroll_no = sc.next();

        //Student is Day Scholar or Hosteller
        String student;
        String room = "";
        do{
        
            System.out.println("Enter \"H\" for Hosteller and \"D\" for Day Scholar");
            student = sc.next();
            if( student.equals("H") || student.equals("h")){
                System.out.println("Room Number: ");
                room = sc.next();
                break;
            }
            else if( student.equals("D") || student.equals("d")){
                break;
            }
            else{
                System.out.println();
                System.out.println("Enter a Valid Option.");

            }
        }while(true);

        System.out.println("Phone Number: ");
        long phone_no = sc.nextLong();

        System.out.println("-------------------------------------------------------------------------------------------");

        //For Departments
        String d1 = "IT Department";
        String d2 = "Finance Department";
        String d3 = "Maintenance Department";

        //If Maintenance Department then Following Sub Departments
        String sub_d1 = "Furniture";
        String sub_d2 = "Electrical";
        String sub_d3 = "Cleaning";

        //IT Department's Sub Categories
        String it_sub1 = "Wi-Fi";
        String it_sub2 = "Attendance and Fingerprint";
        String it_sub3 = "Coll-Poll";
        String it_sub4 = "Codetantra";
        String it_sub5 = "New Id Card";
        String it_sub6 = "Others";

        //Finance Department Sub Categories
        String fin_sub1 = "Fee Receipt";
        String fin_sub2 = "Balance Fee";
        String fin_sub3 = "Others";

        //Asking the Department of Query
        System.out.println("What Department Do You want to raise your Query in?");
        int department_of_query = 0;
        String name_of_department = "";

        do{
            if(student.equals("H") || student.equals("h")){
                System.out.println("\"1\" for \"IT Department\"\n\"2\" for \"Finance Department\"\n\"3\" for \"Maintenance Department\"");
                department_of_query = sc.nextInt();
                if(department_of_query == 1){
                    name_of_department = d1;
                    break;
                }
                else if( department_of_query == 2){
                    name_of_department = d2;
                    break;
                }
                else if( department_of_query == 3){
                    name_of_department = d3;
                    break;
                }
                else{
                    System.out.println();
                    System.out.println("Please select a valid query department.");
                    continue;
                }
            }
            else{
                System.out.println("\"1\" for \"IT Department\"\n\"2\" for \"Finance Department\"");
                department_of_query = sc.nextInt();
                if(department_of_query == 1){
                    name_of_department = d1;
                    break;
                }
                else if( department_of_query == 2){
                    name_of_department = d2;
                    break;
                }
                else{
                    System.out.println();
                    System.out.println("Please select a valid query department.");
                    continue;
                }
            }
        }while(true);

        System.out.println("Name of Department: "+name_of_department);

        System.out.println("-------------------------------------------------------------------------------------------");

        //Asking for Category If the Selected Department is Maintenance When Student is Hosteller
        int category_of_maintenance_var = 0;
        String name_category_of_maintenance_var ="";

        if(department_of_query == 3){
            do{
                System.out.println("Under what category of Maintenance do you have your query?");
                System.out.println("\"1\" for \"Furniture\"\n\"2\" for \"Electrical\"\n\"3\" for \"Cleaning\"");
                category_of_maintenance_var = sc.nextInt();
                if( category_of_maintenance_var == 1){
                    name_category_of_maintenance_var = sub_d1;
                    break;
                }
                else if( category_of_maintenance_var == 2){
                    name_category_of_maintenance_var = sub_d2;
                    break;
                }
                else if (category_of_maintenance_var == 3){
                    name_category_of_maintenance_var = sub_d3;
                    break;
                }
                else{
                    System.out.println();
                    System.out.println("Please select a valid category");
                    continue;
                }
            }while(true);
        }
            
        if( department_of_query == 3){
            System.out.println("Categroy of Maintenance: "+name_category_of_maintenance_var);
        System.out.println("-------------------------------------------------------------------------------------------");
        }


        // Asking for Category if the Selected Department is IT
        int category_of_IT_var = 0;
        String name_category_of_IT_var = "";

        if(department_of_query == 1){
            do{
                System.out.println("Under what category of IT Services do you have your query?");
                System.out.println("\"1\" for \"Wi-Fi\"\n\"2\" for \"Attendance and Fingerprint\"\n\"3\" for \"Coll-Poll\"\n\"4\" for \"Codeantra\"\n\"5\" for \"Others.\"");
                category_of_IT_var = sc.nextInt();
                if( category_of_IT_var == 1){
                    name_category_of_IT_var = it_sub1;
                    break;
                }
                else if( category_of_IT_var == 2){
                    name_category_of_IT_var = it_sub1;
                    break;
                }
                else if (category_of_IT_var == 3){
                    name_category_of_IT_var = it_sub3;
                    break;
                }
                else if (category_of_IT_var == 4){
                    name_category_of_IT_var = it_sub4;
                    break;
                }
                else if (category_of_IT_var == 5){
                    name_category_of_IT_var = it_sub5;
                    break;
                }
                else{
                    System.out.println();
                    System.out.println("Please select a valid category");
                    continue;
                }
            }while(true);
        }

        if( department_of_query == 1){
            System.out.println("Categroy of IT Services: "+name_category_of_IT_var);
        System.out.println("-------------------------------------------------------------------------------------------");
        }

        //Asking for Category if the Selected Department is Finance
        int category_of_finance_var = 0;
        String name_category_of_finance_var ="";

        if(department_of_query == 2){
            do{
                System.out.println("Under what category of Maintenance do you have your query?");
                System.out.println("\"1\" for \"Fee Receipts\"\n\"2\" for \"Balance Fee\"\n\"3\" for \"Others\"");
                category_of_finance_var = sc.nextInt();
                if( category_of_finance_var == 1){
                    name_category_of_finance_var = fin_sub1;
                    break;
                }
                else if( category_of_finance_var == 2){
                    name_category_of_finance_var = fin_sub2;
                    break;
                }
                else if (category_of_finance_var == 3){
                    name_category_of_finance_var = fin_sub3;
                    break;
                }
                else{
                    System.out.println();
                    System.out.println("Please select a valid category");
                    continue;
                }
            }while(true);
        }
            
        if( department_of_query == 2){
            System.out.println("Categroy of Finance: "+name_category_of_finance_var);
        System.out.println("-------------------------------------------------------------------------------------------");
        }

        //Taking Query Input from the Student
        System.out.println("Enter your query :");
        String query = sc.next();

        System.out.println("-------------------------------------------------------------------------------------------");

        //Date and Time
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss z");
        
        Date date = new Date();
 
        formatDate.setTimeZone(TimeZone.getTimeZone("IST"));
        System.out.println("Your Query has been Submitted at: ");
        System.out.println(formatDate.format(date)); 

        //Generating Ticket Number 
        int min = 100;  
        int max = 500; 
        int ticket_number = (int)(Math.random()*(max-min+1)+min);
        System.out.println("Your Query's Ticket Number for "+name_of_department+" is  "+ticket_number);
        System.out.println("Kindly refer to this Ticket Number when visiting the respective Department");
        
        System.out.println("-------------------------------------------------------------------------------------------");

        //Query Resolution for Finance Department
        if (department_of_query == 2){
            System.out.println("Your query has been sent to the Finance Department");
            System.out.println("Kindly visit the Finance Department tomorrow Between 8am to 5.30pm");
        }


        //Query Resolution for IT Department
        if (department_of_query == 1){
            System.out.println("Your query has been sent to the IT Department");
            if (category_of_IT_var == 1)
                System.out.println("A personal will visit your room "+room+" tomorrow at 15:00:00 to look upon the issue regarding the Wi-Fi.");
            else
                System.out.println("Kindly visit the IT Department tomorrow Between 8am to 5.30pm");
        }



        //Query Resolution for Maintenance Department
        if (department_of_query == 3){
            if (category_of_maintenance_var == 1){ //Furniture
                System.out.println("Your query has been sent to the Maintenance Department");
                System.out.println("A personal will visit your room "+room+" tomorrow at 15:00:00 to look upon the issue regarding the furniture.");
            }
            else if (category_of_maintenance_var == 2){ //Electrical
                System.out.println("Your query has been sent to the Maintenance Department");
                System.out.println("A personal will visit your room "+room+" tomorrow at 15:00:00 to look upon the electrical issue.");
            }
            else if (category_of_maintenance_var == 3){ //Cleaning
                System.out.println("Your query has been sent to the Maintenance Department");
                System.out.println("A personal will visit your room "+room+" tomorrow at 15:00:00 to clean the room");
            }
        }


        System.out.println("Thank You!");

    }
}