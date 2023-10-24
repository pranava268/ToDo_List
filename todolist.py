def main():
    while True:
        print("\nOptions:")
        print("1. Add task")
        print("2. Delete task")
        print("3. View tasks")
        print("4. Quit")
        choice = input("Enter your choice: ")
        if choice == '1':
            task_description = input("Enter task description: ")
            
        elif choice == '2':
            task_description = None
            
        elif choice == '3':
            print(task_description)
        elif choice == '4':
            break
        else:
            print("Invalid choice. Please try agin.")
if __name__ == "__main__":
    main()