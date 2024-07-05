package lesson24;

public class BusinessTaxiFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new BusinesTaxi();
    }
}
