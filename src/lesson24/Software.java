package lesson24;

public class Software {
    public static void main(String[] args) {
        var developerFactory = createDeveloperFactoryByLanguage(ProgramingLanguage.JAVA);
        var developer = developerFactory.createDeveloper();
        developer.writeCode();
    }
    private static DeveloperFactory createDeveloperFactoryByLanguage(ProgramingLanguage programingLanguage) {
        return switch (programingLanguage){
            case JAVA -> new JavaDeveloperFactory();
            case KOTLIN -> new KotlinDeveloperFactory();
            case BUSINESS -> new KotlinDeveloperFactory();
        };
    };
}
