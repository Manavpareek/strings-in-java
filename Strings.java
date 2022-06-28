class basic{
    public static void main(String[] args) {
        String firstname="manav";
        String lastname="pareek";
        String fullname=firstname+ " "+ lastname;
        // System.out.println(fullname);
        // System.out.println(fullname.length());

        // charAt() print character by character
        // for(int i=0;i<=fullname.length();i++){
        //     System.out.println(fullname.charAt(i));
        // }
        
        //comparison by compareTo();
        // if(firstname.compareTo(lastname)==0){
        //     System.out.println("equal");

        // }else{
        //     System.out.println("not equal");
        // }

        //printring substring using substring();

        String name=fullname.substring(0,5);
        System.out.println(name);
    }
}