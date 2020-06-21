package day21multidimensionalarray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
        public class Odev {
        	public static void main(String[] args) {
//              String str = "Java'yi sevdiniz mi?";
        //
        //  
//              String arr1[ ] = str.split("");
//              System.out.println(Arrays.toString(arr1));
            /*
            // elemanlarin carpimlari sonucunu veren kod    
                int arr[][]={ {1,2,3}, {4,5,6} };
                int prod = 1; 
                for (int i =0 ; i<arr.length ; i++) {
                    for(int j=0 ; j<arr[i].length ; j++) {
                        prod = prod*arr[i][j];
                    }
                } System.out.println(prod);  */
                // her array'in son elamaninin carpimlari sonucunu veren kod
            /*  int arr[][]= { {1,2,3}, {4,5}, {6} } ;
                
                int prod = 1; 
                for (int i =0 ; i<arr.length ; i++) {
                    for(int j=arr[i].length-1 ; j<arr[i].length ; j++) {
                        prod = prod*arr[i][j];
                    }
                } System.out.println(prod);  */
                
                //ayni indexe sahip elamnlarin toplamlarinin sonucunu veren kod
        /*  int arr1[][] = { {1,2}, {3,4,5}, {6} };
            int arr2[][] = { {7,8,9}, {10,11}, {12} } ;
            int sum= 0; 
                
            for (int i=0; i<arr1.length; i++) {
                for(int j=0 ; j<arr1[i].length ; j++) {
                    for (int i1=0; i1<arr1.length; i1++) {
                        for(int j1=0 ; j1<arr2[i1].length ; j1++) {
                    if(i==i1&&j==j1) {
                        sum=sum+arr1[i][j]+arr2[i1][j1];
                            }
                        }
                    }
                }
            }       System.out.println(sum); */
              
            
                
                //soru : ic array elamanlarini ayri ayri toplasin ve sonuclari bir array'a
                // atayin ve ciktisini veren kod 
                //{ {1,2,3}, {4,5}, {6,7} } Ornegin; { {1,2,3}, {4,5}, {6,7} } ==> 
                //1+2+3=6       4+5=9       6+7=13 ==>    output: {6, 9, 13} 
            /*
                int arr[][]= { {1,2,3}, {4,5}, {6,7} } ;
                int sum1=0;
                int sum2=0;
                int sum3=0;
                for (int i=0 ; i<arr.length ; i++) {
                    for(int j=0 ; j<arr[i].length ; j++) {
                        if(i==0) {
                            sum1=sum1+arr[i][j];
                        } else if(i==1) {
                            sum2=sum2+arr[i][j];
                        } else sum3 = sum3 +arr[i][j];
                    }
                }  
                int arr2[]= {sum1, sum2, sum3};
                int sum4 = 0;
                for (int i=0 ; i<arr2.length; i++) {
                    sum4 = sum4 +arr2[i];
                } System.out.println(Arrays.toString(arr2));
                System.out.println(sum4);  */
            
            /*
                int arr1[][]= { {1,2,3}, {4,5}, {6,7} };
                
                
                int arr2[] = new int[arr1.length];
                
                for (int i = 0; i < arr1.length; i++) {
                    for (int j = 0; j < arr1[i].length; j++) {
                        
                        arr2[i] += arr1[i][j];  
                    }
                }
                    System.out.println(Arrays.toString(arr2));
                    
                    int sum = 0;
                    for (int i=0 ; i<arr2.length; i++) {
                        sum = sum +arr2[i];
                    }   System.out.println(sum);  */
                
                
                //Elemanlari A, C, E, ve F olan bir String ArrayList olusturup yazdirin
                
                List<String> list01 = new ArrayList<>();
                list01.add("A");
                list01.add("C");
                list01.add("E");
                list01.add("F");
                System.out.println(list01);
                
            // Ýndexsiz add() methodunu kullanarak, B’yi ekleyiniz.
            //Ýndex’li add() methodunu kullanarak, L’yi 1 numaralý index’e ekleyiniz.
            //ArrayList’i ekrana yazdýrýnýz, list þöyle olmalý; A, L, C, E, F, B.
                
                list01.add("B");
                list01.add(1, "L");
                System.out.println(list01);
                
            //set() methodu kullanarak, E’yi D yapýnýz.
            //ArrayList’i ekrana yazdýrýnýz, list þöyle olmalý; A, L, C, E, F, B.   
                
                list01.set(3, "D");
                System.out.println(list01);
                
            //remove() methodu kullanarak, F’yi siliniz.
            //ArrayList’i ekrana yazdýrýnýz, list þöyle olmalý; A, L, C, D, B.  
                
                list01.remove(4);
                System.out.println(list01);
                
            //sort() methodu kullanarak, elemanlarý alfabetik sýraya diziniz.
            //ArrayList’i ekrana yazdýrýnýz, list þöyle olmalý; A, B, C, D, L.
                
                Collections.sort(list01);
                System.out.println(list01);
                
            
            //contains() methodu kullanarak, L’nin list’de var oldugunu ve M’nin list’de
            //var olmadýðýný doðrulayýnýz.   
                
                System.out.println(list01.contains("L"));
                System.out.println(list01.contains("M"));
                
            //size() methodu kullanarak, list’in kaç eleman olduðunu ekrana yazdýrýnýz.
                
                System.out.println(list01.size());
                
                
            //clear() methodu kullanarak, list’deki tum elemanlarý siliniz.
                
                list01.clear();
                System.out.println(list01);
                
        //isEmpty() methodu kullanarak, list’deki tum elemanlarýn silindiðini doðrulayýnýz.  
                
                System.out.println(list01.isEmpty());
                
                
            }
        }
