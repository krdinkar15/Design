package designPatterns.creational.builder;

import java.time.LocalDate;
import java.time.Period;

public class UserWebDTOBuilder implements UserDTOBuilder{

    private String firstName;
    private String lastName;
    private String age;
    private String address;
    private UserWebDTO webDTO;

    @Override
    public UserDTOBuilder withFirstName(String firstName) {
        this.firstName=firstName;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lastName) {
        this.lastName=lastName;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthday(LocalDate date) {
        Period ageInYear=Period.between(date,LocalDate.now());
        age=Integer.toString(ageInYear.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address=address.getHouseNumber() +", "+address.getStreet()
                +"\n" +address.getCity() + "\n"+address.getState() +"\n" +address.getZipcode();
        return  this;
    }

    @Override
    public UserDTO build() {
        webDTO=new UserWebDTO(firstName+ " "+lastName,address,age);
        return webDTO;
    }

    @Override
    public UserDTO getUserDTO() {
        return  webDTO;
    }
}
