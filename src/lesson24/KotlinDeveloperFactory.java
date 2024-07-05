package lesson24;

public class KotlinDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new KotlinDeveloper();
    }
}
