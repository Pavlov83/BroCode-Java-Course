class Arrays{

    public static void main(String[] args) {
        
        //with arrays we can store many variables with one reference
        String[] cars = {"Audi","Camaro"};
        cars[0] = "Mustang";

        System.out.println(cars[0]);

        String[] planes = new String[4];
        planes[0] = "Embraer";
        planes[1] = "Boeing";
        planes[2] = "De Haviland";
        planes[3] = "Bombardier";
        
        for(int i = 0; i < planes.length;i++){
            System.out.println(planes[i]);
        }
        

    }
}