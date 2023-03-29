package pl.javastart.validationtask;

import javax.validation.constraints.*;

public class RegisterFormDto {

    @NotBlank
    @Size(min = 3, max = 100, message = "Pole musi mieć conajmnie 3 znaki")
    private String firstName;
    @NotBlank
    @Size(min = 3, max = 100, message = "Pole musi mieć conajmnie 3 znaki")
    private String surname;
    @NotBlank
    @Size(min = 3, max = 100)
    private String address;
    @NotBlank
    @Pattern(regexp = "^[0-9]{2}-[0-9]{3}", message = "Wpisz poprawny kod pocztowy")
    private String postalCode;
    @NotBlank
    @Size(min = 3, max = 50)
    private String city;
    @NotBlank
    @Email
    private String email;
    @NotBlank
    @Size(min = 8, max = 100, message = "Hasło musi posiadać min. 8 znaków")
    @Pattern.List({
            @Pattern(regexp = "(?=.*[a-z]).+", message = "Hasło musi posiadać min. jedną małą literę"),
            @Pattern(regexp = "(?=.*[A-Z]).+", message = "Hasło musi posiadać min. jedną dużą literę"),
            @Pattern(regexp = "(?=.*[!@#$%^&*+=?-_()/\"\\.,<>~`;:]).+", message = "Hasło musi posiadać min. jeden znak specjalny"),
    })
    private String password;
    @NotNull
    private boolean termsAgreement;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isTermsAgreement() {
        return termsAgreement;
    }

    public void setTermsAgreement(boolean termsAgreement) {
        this.termsAgreement = termsAgreement;
    }
}
