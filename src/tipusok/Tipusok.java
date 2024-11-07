
package tipusok;

public class Tipusok {

    public static void main(String[] args) {
        String szo = "abc";//3 elemu char tomb
        char[] betuk = {'a','\n',' '};//urest nem enged
        
        
        //betuk = {'a'}; ez nem mukodik
        final int M =9;
        betuk = new char[M];
        
        betuk[0] ='a';
        betuk[1] ='b';
        betuk[2] ='c';
        betuk[3] ='d';
        //másik megoldáas
        
        int i = 0;
        for(char c ='a';c<= 'i';c++ ){
            System.out.println(c +" ");
           //betuk[i++] = c;
            
        }
        //2.: ascii 97 =a ,98= b, 65 = a
        
        //for(i =97; i<=105;i++){
        for (i = 0; i< 9;i++){
            betuk[i] = (char)(i+97);
        }
        
        
        
        
        
        
        //sorend változtatás
        System.out.println("Sorend változtatás");
        int[] sorrend={0, 1,2 ,3, 4, 5, 6, 7, 8};
        
        for (int j = 0;j < sorrend.length;j++){
            int t = (int)(Math.random()*sorrend.length);
            //2 vátozo cseréje
            int temp = sorrend [j];
            sorrend[j] = sorrend[t];
            sorrend[t] = temp;
            
            
            
        }
        for ( i= 0;i<M;i++){
            if(i !=0 && i%3 ==0){
                System.out.print("");
                
            }
            System.out.println( betuk[sorrend[i]] + " ");
        }
        System.out.println("");
       
        //faktorialis
        System.out.println("Faktoriális");
        long f =1;//tul csordul az int 
        final int F_M =18;
        for (i = 1;i <= F_M; i++){
            f *=i;
        }
        System.out.println(F_M + "! =" + f);
        
        double dPi =Math.PI;//nagyobb
        System.out.printf("dPi: %f\n",dPi);
        System.out.println(dPi);
        float fPi =(float) Math.PI;//kissebb
        System.out.printf("fPi: %f\n",fPi);
        System.out.println(fPi);
        
        if (dPi == fPi){
            System.out.println("dPi == fPi");
        }else{
            System.out.println("dPi != fPi");
        }

        
        
        
        //tipusok intervalluma
        System.out.println("tipusok intervalluma:");
        System.out.println("min byte: " +Byte.MIN_VALUE);
        System.out.println("max byte: " +Byte.MAX_VALUE);
        System.out.println("min Short: " +Short.MIN_VALUE);
        System.out.println("max Short: " +Short.MAX_VALUE);
        System.out.println("min int: " + Integer.MIN_VALUE);
        System.out.println("max int: " + Integer.MAX_VALUE);
        System.out.println("min long: "+ Long.MIN_VALUE);
        System.out.println("max long: "+ Long.MAX_VALUE);
        
        System.out.println("min char: "+ (int)Character.MIN_VALUE);
        System.out.println("max char: "+ (int)Character.MAX_VALUE);
        
    }
    
}
