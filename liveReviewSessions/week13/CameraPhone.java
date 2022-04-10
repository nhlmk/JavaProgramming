package week13;

public class CameraPhone extends Phone{

    int imageSize, memorySize;

    public CameraPhone(int x, int y){

        imageSize = x;
        memorySize = y;
    }

    public CameraPhone(){

    }

    public int numPictures(){
        return memorySize*1000/imageSize;
    }


}
