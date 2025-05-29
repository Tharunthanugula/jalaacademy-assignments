 1. PRIVATE Access Modifier Example

class PrivateExample {
    private int privateField = 100;

    private void privateMethod() {
        System.out.println("Private method called");
    }

    public static void main(String[] args) {
        PrivateExample obj = new PrivateExample();
        System.out.println("Private Field: " + obj.privateField);
        obj.privateMethod();
    }
}

class PrivateSubClass extends PrivateExample {
    public void tryAccess() {
    }
}

 2. DEFAULT Access Modifier Example
class DefaultExample {
    int defaultField = 200;

    void defaultMethod() {
        System.out.println("Default method called");
    }
}

class DefaultAccess {
    public static void main(String[] args) {
        DefaultExample obj = new DefaultExample();
        System.out.println("Default Field: " + obj.defaultField);
        obj.defaultMethod();
    }
}

3. PROTECTED Access Modifier Example (Same Package)
class ProtectedExample {
    protected int protectedField = 300;

    protected void protectedMethod() {
        System.out.println("Protected method called");
    }
}

class ProtectedAccessSamePackage {
    public static void main(String[] args) {
        ProtectedExample obj = new ProtectedExample();
        System.out.println("Protected Field: " + obj.protectedField);
        obj.protectedMethod();
    }
}

/3. PROTECTED Access Modifier from Subclass in Different Package (Simulated)
class ProtectedSubClassDifferentPackage extends ProtectedExample {
    public void accessProtected() {
        System.out.println("Protected Field from subclass in different package: " + protectedField);
        protectedMethod();
    }
}

class OtherClassDifferentPackage {
    public void tryAccess() {
        ProtectedExample obj = new ProtectedExample();
        
    }
}

4. PUBLIC Access Modifier Example
class PublicExample {
    public int publicField = 400;

    public void publicMethod() {
        System.out.println("Public method called");
    }
}

class PublicAccess {
    public static void main(String[] args) {
        PublicExample obj = new PublicExample();
        System.out.println("Public Field: " + obj.publicField);
        obj.publicMethod();
    }
}
