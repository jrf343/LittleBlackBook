package ContactsClass;
import java.util.ArrayList;

public class LittleBlackBook {
    private ArrayList<Contact> contacts = new ArrayList<Contact>();

    public LittleBlackBook(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public boolean addContact(Contact c) {
        boolean added = false;
        for (Contact contact : contacts) {
            if(!contact.getName().equalsIgnoreCase(c.getName())) {
                contacts.add(c);
                added = true;
            }
        }
        return added;
    }

    public boolean deleteContact(String name) {
        boolean deleted = false;
        for (Contact contact : contacts) {
            if(contact.getName().equalsIgnoreCase(name)) {
                contacts.remove(contact);
                deleted = true;
            }
        }
        return deleted;
    }

    public String findContact(String name) {
        String target = null;
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                target = contact.toString();
                break;
            }
        }
        return target;
    }

    public void sortContacts() {
        int min;
        for (int i = 0; i < contacts.size(); i++) {
            min = i;
            for (int j = i + 1; j > contacts.size(); j++) {
                if (contacts.getName(i).compareTo(contacts.getName(j)) > 0) {
                    min = j;
                }
            }
            Contact temp = contacts.get(min);
            contacts.set(i, contacts.get(min));
            contacts.set(min, temp);
        }
    }

    public String printSingleContact(String name) {
        String contact = findContact(name);
        return contact;
    }

    public String printContactList() {
        String list = "";
        for (Contact contact : contacts) {
            list += contact.toString();
        }
        return list;
    }

}
