//Evan Painter
//Rkk628

import java.awt.Rectangle;

public class HouseCalculator{
    public static void main(String[] args) {
        System.out.println("House Calculations begin now:");
        double houseHeight = 25.5, houseWidth = 65.2, houseDepth = 75.75;
        System.out.println("Height: "+houseHeight+"ft, Width: "+houseWidth+"ft, Depth: "+houseDepth+"ft");
        
        double windowHeight = 1.2, windowWidth = .75;
        int windowNum = 19;
        double doorHeight = 1.75, doorWidth = 0.95;
        int doorNum = 5;
        System.out.println("window ht: "+windowHeight+", window wdth: "+windowWidth+", num of windows: "+windowNum);
        System.out.println("door ht: "+doorHeight+", door wdth: "+doorWidth+", num of doors: "+doorNum);
        
        double roofSa, floorSa, swLeftSa, swRightSa, fwSa, bwSa =0;
        double house1Sa, house2Sa;
        //surface area of house 1 and 2 are declared using numbers in instructions so i thought it would be appropriate to do so here instead of typing out long lines of code
        String good="good", bad="bad", bor="boring", exc="exciting", big="big", sma="small", name="Evan";
        fwSa= houseWidth*houseHeight;
        bwSa= houseWidth*houseHeight;
        swRightSa=houseDepth*houseHeight;
        swLeftSa=houseDepth*houseHeight;
        roofSa=houseWidth*houseDepth;
        floorSa=houseWidth*houseDepth;
        
        double areaFrontBackWalls=fwSa, areaSideWalls=swRightSa, roofAndFloorSa=roofSa;
        System.out.println("Front and back wall each have area: "+areaFrontBackWalls);
        System.out.println("Left and right wall each have area: "+areaSideWalls);
        System.out.println("Roof and floor each have area: "+roofAndFloorSa);
        //house1Sa assigns total surface area 
        house1Sa=fwSa+bwSa+swRightSa+swLeftSa+roofSa+floorSa;
        System.out.println("This is "+name+"'s house. it is "+exc+"!");
        System.out.println("Total surface area, ignoring windows and doors: "+house1Sa);
        //house2Sa assigns total surface area minus total area of windows
        house2Sa=house1Sa-windowHeight*windowWidth*windowNum;
        System.out.println("Total area, without windows: "+house2Sa);
        System.out.println("This is "+name+"'s house. it is "+big+"!");
        //In the instructions it says to assign the 2nd declaration we made for storing total area, which was house2Sa, but in step 7 it's supposed to include windows and doors, so I just declared a whole new variable for the area accounting for windows and doors
        double areaNoDoorsWindows=house2Sa-doorHeight*doorWidth*doorNum;
        System.out.println("Total area, without windows and doors: "+areaNoDoorsWindows);
        
        Rectangle house = new Rectangle (7,13,5,10);
        System.out.println("Rectangle X location: "+house.getX());
        System.out.println("Rectangle y location: "+house.getY());
        System.out.println("Rectangle Width: "+house.getWidth());
        System.out.println("Rectangle Height: "+house.getHeight());
        house.grow(5,8);
        System.out.println("After growing the rectangle: ");
        System.out.println("Rectangle X location: "+house.getX());
        System.out.println("Rectangle y location: "+house.getY());
        System.out.println("Rectangle Width: "+house.getWidth());
        System.out.println("Rectangle Height: "+house.getHeight());
        System.out.println("After translating the rectangle: ");
        house.translate(5,8);
        System.out.println("Rectangle X location: "+house.getX());
        System.out.println("Rectangle y location: "+house.getY());
    
        int num1 = 5;
        int num2 = 10;
        int num3 = num1;
        num1 = num2;
        num2 = num1 + 10;
        num3 = num3 + 5;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        Rectangle box1 = new Rectangle(1, 2, 3, 5);
Rectangle box2 = box1;
Rectangle box3 = new Rectangle(7, 6, 10, 5);
box1.translate(3, 2);
box2.translate(2, 2);
box3.translate(5, 7);
box1.translate(3, 4);
System.out.println("box1 x = " + box1.getX() + " box1 y = " + box1.getY());
System.out.println("box2 x = " + box2.getX() + " box2 y = " + box2.getY());
System.out.println("box3 x = " + box3.getX() + " box3 y = " + box3.getY());
        
        
        
        
        

        
        
    }
}
