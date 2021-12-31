//  package com.example.demo.Core;
//  import java.util.*;

//  public class main {
    
//      public static void main(String[] args) {
//          userManager um =new userManager();
//          Customer c= new Customer("moha","123","12","12");
//          um.UserRegister(c);
//          um.loginForCustomer("moha", "123");
//      }
//     }
//         // make an object from the classes //
//         Scanner sc = new Scanner(System.in);
//         ArrayList<Driver> Drivers = new ArrayList<Driver>();
//         ArrayList<Customer> Customers = new ArrayList<Customer>();
//         ArrayList<Integer> index = new ArrayList<Integer>();
//         int numberOfDrivers;
//         int numberOfCustomers;
//         int driverIndex;
//         int customerIndex;
//         Ride r = new Ride();
//         userManager um = new userManager();
//         admin a = new admin();
//         boolean cond = true;
//         System.out.println("How many drivers accounts do you want to register?");
//         numberOfDrivers = sc.nextInt();
//         for (int i = 0; i < numberOfDrivers; i++) {
//             Driver d = new Driver();
//             Drivers.add(d);
//         }
//         System.out.println("How many customer do you want to register?");
//         numberOfCustomers = sc.nextInt();

//         for (int i = 0; i < numberOfCustomers; i++) {
//             Customer c = new Customer();
//             Customers.add(c);
//         }
//         while (cond) {
//             System.out.println("Which driver account do you want to register with? ex: 1,2,.....");
//             driverIndex = sc.nextInt() - 1;
//             um.indexSet(driverIndex);

//             System.out.println("Which customer account do you want to register with? ex: 1,2,.....");
//             customerIndex = sc.nextInt() - 1;
//             um.indexSet(customerIndex);
//             System.out.println("lw 3ayz t3'yr el user dos 10");
//             int indexOfSwitch = sc.nextInt();

//             switch (indexOfSwitch) {
                
//                 case 1:
//                     System.out.println("******************** Driver registration ********************");
//                     System.out.println("Enter username: ");
//                     Drivers.get(index.get(0)).setUsername(sc.next());
//                     System.out.println("Enter password: ");
//                     Drivers.get(driverIndex).setPassword(sc.next());
//                     System.out.println("Enter email: ");
//                     Drivers.get(driverIndex).setEmail(sc.next());
//                     System.out.println("Enter mobile number: ");
//                     Drivers.get(driverIndex).setMobileNum(sc.next());
//                     System.out.println("Enter license num: ");
//                     Drivers.get(driverIndex).setLicense(sc.next());
//                     System.out.println("Enter nationalID: ");
//                     Drivers.get(driverIndex).setNationalID(sc.next());
//                     a.listPendingReq(Drivers.get(driverIndex));
//                     um.DriverRegister(Drivers.get(driverIndex));
//                     a.verifyRegistration(Drivers.get(driverIndex));
//                     break;
//                 case 2:
//                     System.out.println("******************** Driver log in ********************");
//                     System.out.println("Enter username: ");
//                     String UserForDriver = sc.next();
//                     System.out.println("Enter password: ");
//                     String PassForDriver = sc.next();
//                     Drivers.get(driverIndex).login(Drivers.get(driverIndex), um, UserForDriver, PassForDriver);
//                     break;
//                 case 3:
//                     System.out.print("Enter the number of favourite areas you want to store: ");
//                     int numOfFavArea = sc.nextInt();
//                     String[] faveArea = new String[numOfFavArea + 1];
//                     System.out.println("Enter the Favourite areas: ");
//                     for (int i = 0; i < numOfFavArea + 1; i++) {
//                         faveArea[i] = sc.nextLine();
//                     }
//                     Drivers.get(driverIndex).setFavArea(faveArea);
//                     break;
//                 case 4:
//                     // System.out.println("******************** customer registration ********************");
//                     // System.out.println("Enter username: ");
//                     // Customers.get(customerIndex).setUsername(sc.next());
//                     // System.out.println("Enter password: ");
//                     // Customers.get(customerIndex).setPassword(sc.next());
//                     // System.out.println("Enter email: ");
//                     // Customers.get(customerIndex).setEmail(sc.next());
//                     // System.out.println("Enter mobile number: ");
//                     // Customers.get(customerIndex).setMobileNum(sc.next());
//                     // um.UserRegister(Customers.get(customerIndex));
//                     break;
//                 case 5:
//                     System.out.println("******************** customer log in ********************");
//                     System.out.println("Enter username: ");
//                     String UserForCustomer = sc.next();
//                     System.out.println("Enter password: ");
//                     String PassForCustomer = sc.next();
//                     Customers.get(customerIndex).login(UserForCustomer, PassForCustomer);
//                     break;
//                 case 6:
//                     System.out.println("Enter source area to request a ride: ");
//                     String SourceArea = sc.next();
//                     System.out.println("Enter destination to request a ride: ");
//                     String Destination = sc.next();
//                     Customers.get(customerIndex).r.rm.reqRide(r, SourceArea, Destination);
//                     Drivers.get(driverIndex).notifyDriver(SourceArea);
//                     r.registerObserver(Customers.get(customerIndex));
//                     break;
//                 case 7:
//                     System.out.println("Enter the offer:");
//                     int offer = sc.nextInt();
//                     r.setPrice(offer);
//                     r.setPrice(200);
//                     r.setPrice(300);
//                     System.out.println("Enter the offer that you would like to accept: ");
//                     int acceptedOffer = sc.nextInt();
//                     r.acceptedOffer(acceptedOffer);
//                     break;
//                 case 8:
//                     System.out.println("Today is Sunday");
//                     break;
//                 default:
//                     break;
//             }
//             // Driver inputs to register //

//             // Admin verify the request //

//             // Driver inputs to log in //

//             // driver inputs to add favourite area //

//             // customer inputs to log in //

//             // customer inputs to request a ride //

//         }
//     }
 //}