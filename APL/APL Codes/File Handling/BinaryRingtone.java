 import java.io.*;
 class BinaryRingtone{
    public static void main(String args[]){
        try{
            FileInputStream fin = new FileInputStream("song.mp3");
            FileOutputStream fout = new FileOutputStream("tone.mp3");

            byte[] arr = new byte[1024];

            for(int i=0;i<2048;i++){
                fin.read(arr);
                fout.write(arr);          
            }
            fout.close();
            fin.close();
        } catch(Exception e){
            System.out.print(e);
        }
    }
 }