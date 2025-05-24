 1. Arithmetic Exception without handling
def arithmetic_exception_no_handling():
    print("1. Arithmetic Exception without handling:")
    result = 10 / 0  # Will raise ZeroDivisionError

2. Handle Arithmetic Exception using try-except
def handle_arithmetic_exception():
    print("\n2. Handle Arithmetic Exception:")
    try:
        result = 10 / 0
    except ZeroDivisionError:
        print("Caught ZeroDivisionError: Division by zero!")

 3. Method that raises exception, called without try block
def method_that_raises():
    raise ValueError("This method throws an exception!")

 4. Multiple except blocks
def multiple_excepts():
    print("\n4. Multiple except blocks:")
    try:
        a = int("hello")
    except ValueError:
        print("Caught ValueError!")
    except TypeError:
        print("Caught TypeError!")
    except Exception as e:
        print(f"General exception: {e}")

 5. Throw exception with custom message
def custom_message_exception():
    print("\n5. Throw exception with your own message:")
    raise Exception("Custom error message thrown manually")

 6. Create and raise your own exception
class MyCustomException(Exception):
    pass

def raise_custom_exception():
    print("\n6. Raising custom exception:")
    raise MyCustomException("This is a custom exception")

 7. Finally block
def finally_block_demo():
    print("\n7. Finally block demonstration:")
    try:
        print("Trying something risky...")
        x = 10 / 0
    except ZeroDivisionError:
        print("Caught ZeroDivisionError!")
    finally:
        print("Finally block always executes.")

8. Arithmetic Exception
def generate_arithmetic_exception():
    print("\n8. Generate Arithmetic Exception:")
    try:
        x = 1 / 0
    except ZeroDivisionError:
        print("Arithmetic Exception caught.")

 9. FileNotFoundException
def generate_file_not_found():
    print("\n9. Generate FileNotFoundError:")
    try:
        with open("non_existent_file.txt", "r") as file:
            data = file.read()
    except FileNotFoundError:
        print("FileNotFoundError caught.")

 10. ClassNotFoundException simulation
def generate_class_not_found():
    print("\n10. Generate simulated ClassNotFoundException:")
    try:
        __import__("non_existent_module")
    except ModuleNotFoundError:
        print("ModuleNotFoundError (like ClassNotFoundException) caught.")

 11. IOException simulation
def generate_io_exception():
    print("\n11. Generate IOError:")
    try:
        with open("/root/protected.txt", "w") as file:
            file.write("Test")
    except IOError as e:
        print(f"IOError caught: {e}")

12. NoSuchFieldException simulation
class DemoClass:
    def __init__(self):
        self.name = "JALA"

def generate_no_such_field_exception():
    print("\n12. Simulate NoSuchFieldException:")
    obj = DemoClass()
    try:
        print(obj.age)
    except AttributeError:
        print("AttributeError (like NoSuchFieldException) caught.")

 Main block
if __name__ == "__main__":
    # Commented to prevent crashing
    # arithmetic_exception_no_handling()

    handle_arithmetic_exception()

    try:
        method_that_raises()
    except ValueError as e:
        print(f"\n3. Exception from method: {e}")

    multiple_excepts()

    try:
        custom_message_exception()
    except Exception as e:
        print(f"\n5. Caught custom message exception: {e}")

    try:
        raise_custom_exception()
    except MyCustomException as e:
        print(f"\n6. Caught MyCustomException: {e}")

    finally_block_demo()
    generate_arithmetic_exception()
    generate_file_not_found()
    generate_class_not_found()
    generate_io_exception()
    generate_no_such_field_exception()
