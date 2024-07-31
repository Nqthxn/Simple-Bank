    public static void createAccount(Scanner input){
        System.out.print("Enter your name : ");
        String name = input.nextLine();

        System.out.print("Enter age : ");
        int age = input.nextInt();
        input.nextLine();

        Users newUser = new Users(name, age);
        people.add(newUser);

        for(int i = 0; i < people.size(); i++){
            System.out.println(people.get(i));
        }
