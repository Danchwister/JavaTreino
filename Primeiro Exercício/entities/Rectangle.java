package entities;

public class Rectangle {

public double widght;
public double height;

public double area () {

return this.height*this.widght;
}
public double perimeter (){

    return 2*this.height*this.widght;
}
public double diagonal (){
return Math.sqrt(widght*widght + height*height);

}



}