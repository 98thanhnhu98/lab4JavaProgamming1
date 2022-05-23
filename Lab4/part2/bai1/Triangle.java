package JPL0Lab4.part2.bai1;

public class Triangle extends Shape{
        private int base;
        private int height;
        @Override
        public int getArea(){
                return base * height;
        }
        public String toString(){
                return super.toString();
        }
        }
