

 1. Class with default, one-arg, and two-arg constructors
class ConstructorExample:
    def __init__(self, name=None, age=None):
        if name is None and age is None:
            print("Default constructor called")
        elif age is None:
            print(f"One-argument constructor called: {name}")
        else:
            print(f"Two-argument constructor called: {name}, {age}")


 2. Calling superclass constructors from child class
class SuperClass:
    def __init__(self, message=None):
        if message:
            print(f"Argument constructor of SuperClass: {message}")
        else:
            print("Default constructor of SuperClass")

class SubClass(SuperClass):
    def __init__(self, msg=None):
        if msg:
            super().__init__(msg)
            print(f"Argument constructor of SubClass: {msg}")
        else:
            super().__init__()
            print("Default constructor of SubClass")


 3. Constructors with different access modifiers (Python uses naming conventions)
class AccessModifierConstructor:
    def __init__(self, name=None, age=None, number=None, mode=None):
        if mode == "private":
            self.__private_constructor()
        elif mode == "public":
            self.public_constructor(name)
        elif mode == "protected":
            self._protected_constructor(number)
        elif mode == "default":
            self.default_constructor(name, age)

    def __private_constructor(self):
        print("Private constructor")

    def public_constructor(self, name):
        print(f"Public constructor: {name}")

    def _protected_constructor(self, num):
        print(f"Protected constructor: {num}")

    def default_constructor(self, name, age):
        print(f"Default constructor: {name}, {age}")


 4. Attributes of a constructor
class AttributeConstructor:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def display(self):
        print(f"Name: {self.name}, Age: {self.age}")


 Main block to run all examples
if __name__ == "__main__":
    print("=== ConstructorExample ===")
    ConstructorExample()
    ConstructorExample("Tharun")
    ConstructorExample("Tharun", 22)

    print("\n=== SubClass Constructors ===")
    SubClass()
    SubClass("Hello")

    print("\n=== AccessModifierConstructor ===")
    AccessModifierConstructor(mode="private")
    AccessModifierConstructor(name="Tharun", mode="public")
    AccessModifierConstructor(number=25, mode="protected")
    AccessModifierConstructor(name="Tharun", age=22, mode="default")

    print("\n=== AttributeConstructor ===")
    obj = AttributeConstructor("Tharun", 22)
    obj.display()
