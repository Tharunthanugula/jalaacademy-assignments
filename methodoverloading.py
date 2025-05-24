 1. Same name, different number of parameters (same type)
def greet(*args):
    if len(args) == 1:
        print(f"Hello, {args[0]}!")
    elif len(args) == 2:
        print(f"Hello, {args[0]} and {args[1]}!")
    else:
        print("Hello!")

 2. Same name, different number of parameters (different types)
def add(a, b=None):
    if b is None:
        print(f"Single parameter: {a}")
    elif isinstance(a, int) and isinstance(b, int):
        print(f"Sum of integers: {a + b}")
    elif isinstance(a, str) and isinstance(b, str):
        print(f"Concatenation: {a + b}")
    else:
        print("Unsupported types")
3. Same name, same number of parameters (same type)
def multiply(a, b):
    if isinstance(a, int) and isinstance(b, int):
        print(f"Multiplication result: {a * b}")
    else:
        print("Please provide two integers.")

 Main block
if __name__ == "__main__":
    print("=== Method Overloading Simulation in Python ===")

    print("\n1. greet() method examples:")
    greet("Tharun")
    greet("Tharun", "Ravi")

    print("\n2. add() method examples:")
    add(5)
    add(10, 20)
    add("JALA", "Tech")

    print("\n3. multiply() method example:")
    multiply(4, 5)
