package Exception_Assignment;
class 2_StudentGradeParser{
    public static void main(String[] args){
        string[] str = new string[]{"90","A+","85"};
        try{
            for(String s : str){
                System.out.println(Integer.parsInt(s));
            }
        }(NumberFormatException e){
            System.out.println("Invalid grade input: A+");
        }
    }
}