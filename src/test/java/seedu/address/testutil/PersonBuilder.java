package seedu.address.testutil;

import java.util.HashSet;
import java.util.Set;

import seedu.address.model.person.Email;
import seedu.address.model.person.ModTutGroup;
import seedu.address.model.person.Name;
import seedu.address.model.person.Person;
import seedu.address.model.person.TelegramHandle;
import seedu.address.model.util.SampleDataUtil;

/**
 * A utility class to help with building Person objects.
 */
public class PersonBuilder {

    public static final String DEFAULT_NAME = "Amy Bee";
    //    public static final String DEFAULT_PHONE = "85355255";
    public static final String DEFAULT_EMAIL = "amy@gmail.com";
    //    public static final String DEFAULT_ADDRESS = "123, Jurong West Ave 6, #08-111";
    public static final String DEFAULT_TELEHANDLE = "@amy_13ee";
    public static final String DEFAULT_MODTUTGRP = "CS1234-A10";

    private Name name;
    //private Phone phone;
    private Email email;
    private TelegramHandle teleHandle;
    private Set<ModTutGroup> modTutGrp = new HashSet<>();
    //private Address address;
    //private Set<Tag> tags;

    /**
     * Creates a {@code PersonBuilder} with the default details.
     */
    public PersonBuilder() {
        name = new Name(DEFAULT_NAME);
        //phone = new Phone(DEFAULT_PHONE);
        email = new Email(DEFAULT_EMAIL);
        teleHandle = new TelegramHandle(DEFAULT_TELEHANDLE);
        modTutGrp.add(new ModTutGroup(DEFAULT_MODTUTGRP));
        //address = new Address(DEFAULT_ADDRESS);
        //tags = new HashSet<>();
    }

    /**
     * Initializes the PersonBuilder with the data of {@code personToCopy}.
     */
    public PersonBuilder(Person personToCopy) {
        name = personToCopy.getName();
        //phone = personToCopy.getPhone();
        email = personToCopy.getEmail();
        teleHandle = personToCopy.getTelegramHandle();
        modTutGrp = personToCopy.getModTutGroups();
        //address = personToCopy.getAddress();
        //tags = new HashSet<>(personToCopy.getTags());
    }

    /**
     * Sets the {@code Name} of the {@code Person} that we are building.
     */
    public PersonBuilder withName(String name) {
        this.name = new Name(name);
        return this;
    }

    //    /**
    //     * Parses the {@code tags} into a {@code Set<Tag>} and set it to the {@code Person} that we are building.
    //     */
    //    public PersonBuilder withTags(String... tags) {
    //        this.tags = SampleDataUtil.getTagSet(tags);
    //        return this;
    //    }
    //
    //    /**
    //     * Sets the {@code Address} of the {@code Person} that we are building.
    //     */
    //    public PersonBuilder withAddress(String address) {
    //        this.address = new Address(address);
    //        return this;
    //    }
    //
    //    /**
    //     * Sets the {@code Phone} of the {@code Person} that we are building.
    //     */
    //    public PersonBuilder withPhone(String phone) {
    //        this.phone = new Phone(phone);
    //        return this;
    //    }

    /**
     * Sets the {@code Email} of the {@code Person} that we are building.
     */
    public PersonBuilder withEmail(String email) {
        this.email = new Email(email);
        return this;
    }

    /**
     * Sets the {@code TelegramHandle} of the {@code Person} that we are building.
     */
    public PersonBuilder withTele(String teleHandle) {
        this.teleHandle = new TelegramHandle(teleHandle);
        return this;
    }

    /**
     * Parses the {@code modTuts} into a {@code Set<ModTutGroup>}
     * and set it to the {@code Person} that we are building.
     */
    public PersonBuilder withModTut(String... modTut) {
        this.modTutGrp = SampleDataUtil.getModTutSet(modTut);
        return this;
    }

    /**
     * Builds the {@code Person} object.
     */
    public Person build() {
        //        return new Person(name, phone, email, address, tags);
        return new Person(name, email, teleHandle, modTutGrp);
    }

}
