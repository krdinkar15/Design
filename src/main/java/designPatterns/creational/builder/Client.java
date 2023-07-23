package designPatterns.creational.builder;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
        User user=createUser();
        UserDTOBuilder builder=new UserWebDTOBuilder();
        UserDTO userDTO=directBuild(builder,user);
        System.out.println(userDTO.toString());

    }

    private static UserDTO directBuild(UserDTOBuilder userDTOBuilder,User user)
    {
        UserDTO userDTO =userDTOBuilder.withFirstName(user.getFirstName())
                        .withLastName(user.getLastName())
                        .withAddress(user.getAddress())
                        .withBirthday(user.getBirthday())
                        .build();
        return userDTO;
    }
    public static User createUser()
    {
        User user=new User();
        user.setBirthday(LocalDate.of(1997,1,1));
        user.setFirstName("f_name");
        user.setLastName("s_name");
        Address address=new Address();
        address.setHouseNumber("House -1A");
        address.setStreet("street 1");
        address.setCity("city 1");
        address.setZipcode("123");
        address.setState("state-1");
        user.setAddress(address);
        return  user;
    }
}
