package task3_passport;

import task1_transport.StringUtils;

import java.time.LocalDate;
import java.util.Objects;

public class Passport {
    private String number;
    private String secondName;
    private String firstName;
    private String patronymic;
    private LocalDate birthday;

    public Passport(String number, String secondName, String firstName, String patronymic, LocalDate birthday) {
        setNumber(number);
        setSecondName(secondName);
        setFirstName(firstName);
        this.patronymic = patronymic;
        setBirthday(birthday);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        if (StringUtils.isValid(number)) {
            number = "номер паспорта не указан";
        }
        this.number = number;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        if (StringUtils.isValid(secondName)) {
            secondName = "фамилия не указана";
        }
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (StringUtils.isValid(firstName)) {
            firstName = "имя не указано";
        }
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        if (birthday == null) {
            birthday = LocalDate.of(0000, 00, 00);
        }
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(number, passport.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "номер паспорта: " + number + ", фамилия: " + secondName + ", имя: " + firstName +
                ", отчество: " + patronymic + ", дата рождения: " + birthday;
    }
}
