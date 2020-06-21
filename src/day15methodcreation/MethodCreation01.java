package day15methodcreation;

public class MethodCreation01 {

	public static void main(String[] args) {


//		toplama();//8
//		carpma();//15
		
		System.out.println(toplama(3,5));//verilen sayilarra argument denir
		System.out.println(carpma(3,5));//  (ali,5)XXX olamaz eslesmiyor

	}
	
//	//Bir methodu main methodun icinden cagirmak icin mutlaka static kelimesini kullanmalisiniz.
//	public static void toplama() {
//		System.out.println(3+5);
//	}
//	
//	public static void carpma(){
//		System.out.println(3*5);
		
		//method parantezinin icinde olustrulan variablelere parametre denir
		//methodu cagirirken medhod parantezinin icinde yazilan gecerlere argument denir
		//parametrenin data type ile argumnetin data type  bire bir eslesmeli
	public static int toplama(int num1,int num2) {
			return num1 + num2;
			
		}
					
		public static int carpma(int num1,int num2) {
			return num1*num2;
			
		
	}

}
