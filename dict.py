JALA Technologies – Assignment 15: Dictionary Operations

1. Create a Dictionary with at least 5 key value pairs of the Student ID and Name
students = {
    "S101": "Tharun",
    "S102": "Aisha",
    "S103": "Rahul",
    "S104": "Sneha",
    "S105": "Karan"
}

print("1. Initial Student Dictionary:")
print(students)

 1.1 Adding values to the dictionary
students["S106"] = "Meera"
print("\n1.1 After Adding New Student (S106: Meera):")
print(students)

 1.2 Updating values in the dictionary
students["S102"] = "Aisha Reddy"
print("\n1.2 After Updating Student S102:")
print(students)

 1.3 Accessing a value from the dictionary
print("\n1.3 Access Student S103 Name:")
print("S103:", students.get("S103"))

 1.4 Create a nested loop dictionary
nested_students = {
    "S101": {"name": "Tharun", "grade": "A"},
    "S102": {"name": "Aisha Reddy", "grade": "B"},
    "S103": {"name": "Rahul", "grade": "A+"}
}
print("\n1.4 Nested Dictionary of Students:")
print(nested_students)

 1.5 Access values of a nested loop dictionary
print("\n1.5 Access name and grade of S102:")
print("Name:", nested_students["S102"]["name"])
print("Grade:", nested_students["S102"]["grade"])

 1.6 Print the keys present in the dictionary
print("\n1.6 Keys in main dictionary:")
print(list(students.keys()))

 1.7 Delete a value from dictionary
del students["S105"]
print("\n1.7 After Deleting Student S105:")
print(students)
