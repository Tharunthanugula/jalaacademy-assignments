

# 1. Read a text file
def read_text_file():
    try:
        with open('sample.txt', 'r') as file:
            content = file.read()
            print("File Content:\n", content)
    except FileNotFoundError:
        print("sample.txt not found.")

# 2. Write text to .txt file using InputStream (input())
def write_text_to_file():
    text = input("Enter text to write to file: ")
    with open('output.txt', 'w') as file:
        file.write(text)
    print("Text written to output.txt")

# 3. Read a file stream in chunks
def read_file_stream():
    try:
        with open('sample.txt', 'r') as file:
            while True:
                chunk = file.read(10)
                if not chunk:
                    break
                print(chunk)
    except FileNotFoundError:
        print("sample.txt not found.")

# 4. Read a file stream with random access
def read_file_random_access():
    try:
        with open('sample.txt', 'r') as file:
            file.seek(5)
            data = file.read(10)
            print("Data from byte 5 to 15:", data)
    except FileNotFoundError:
        print("sample.txt not found.")

# 5. Read from a specific index using seek()
def read_file_from_index():
    try:
        index = int(input("Enter index to start reading: "))
        with open('sample.txt', 'r') as file:
            file.seek(index)
            content = file.read(20)
            print(f"Data from index {index}:", content)
    except FileNotFoundError:
        print("sample.txt not found.")
    except ValueError:
        print("Invalid index entered.")

# 6. Check file read/write permissions
import os
def check_file_permissions():
    file_path = 'sample.txt'
    can_read = os.access(file_path, os.R_OK)
    can_write = os.access(file_path, os.W_OK)
    print(f"Read access to {file_path}: {'Yes' if can_read else 'No'}")
    print(f"Write access to {file_path}: {'Yes' if can_write else 'No'}")


# To run any function, uncomment it below:
# read_text_file()
# write_text_to_file()
# read_file_stream()
# read_file_random_access()
# read_file_from_index()
# check_file_permissions()
