package mx.raulgarcia.android.androidchat.addcontact;

/**
 * Created by rraulg5 on 22/07/2016.
 */
public class AddContactInteractorImpl implements AddContactInteractor {

    AddContactRepository repository;

    public AddContactInteractorImpl() {
        repository = new AddContactRepositoryImpl();
    }

    @Override
    public void execute(String email) {
        repository.addContact(email);
    }
}
