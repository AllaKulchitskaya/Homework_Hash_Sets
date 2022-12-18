package task3_passport;

import java.util.HashSet;
import java.util.Set;

public class PassportDataBase {
    private Set<Passport> passports = new HashSet<>();

    public PassportDataBase(Set<Passport> passports) {
        this.passports = passports;
    }

    public void addPassport(Passport passport) {
        Passport outdatedPassport = getPassport(passport.getNumber());
        if (outdatedPassport != null) {
            passports.remove(outdatedPassport);
            passports.add(passport);
        }
    }

    public Passport getPassport (String number) {
        for (Passport passport : passports) {
            if (passport.getNumber().equals(number)) {
                return passport;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return passports.toString();
    }
}
