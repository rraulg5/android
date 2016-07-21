package mx.raulgarcia.android.androidchat.contactlist;

/**
 * Created by rraulg5 on 21/07/2016.
 */
public class ContactListInteractorImpl implements ContactListInteractor {

    ContactListRepository repository;

    public ContactListInteractorImpl() {
        repository = new ContactListRepositoryImpl();
    }

    @Override
    public void suscribe() {
        repository.suscribeToContactListEvents();
    }

    @Override
    public void unsuscribe() {
        repository.unsuscribeToContactListEvents();
    }

    @Override
    public void destroyListener() {
        repository.destroyListener();
    }

    @Override
    public void removeContact(String email) {
        repository.removeContact(email);
    }
}
