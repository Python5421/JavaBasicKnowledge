package lanyue;

class StringFormatTest {
    public static void main(String[] args) {

        StringNullTest();
    }
    static void StringNullTest(){
        String a1="";
        String a2=null;
        if(a1.equals("")){
            System.out.println("equals可用");
        }
        if(a1==""){
            System.out.println("==可用");
        }
        if(a1.isEmpty()){
            System.out.println("isEmpty可用");
        }
        if(a2==null){
            System.out.println("==null不可用");
        }
//        if(a2.equals("")){
//            System.out.println("equals可用");
//        }
        if(a2==""){
            System.out.println("==可用");
        }
//        if(a2.isEmpty()){
//            System.out.println("isEmpty可用");
//        }
        if(a2==null){
            System.out.println("==null");
        }
        if(a1==null||a1.equals("")){
            System.out.println("true");
        }
    }
    static void  StringFormatTest(){
        double aa=0.26541543;
        String dd=String.format("%1$.6f",aa);
        System.out.println(dd);
    }
}
