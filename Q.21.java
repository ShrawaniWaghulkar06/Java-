class UsernameValidator:
    def __init__(self, username):
        self.username = username

    def clean_username(self):
        # Remove leading and trailing spaces
        cleaned = self.username.strip()
        
        # Convert to lowercase
        cleaned = cleaned.lower()
        
        return cleaned

# Accept input from user
username_input = input("Enter username: ")

# Create object
validator = UsernameValidator(username_input)

# Display cleaned username
print("Cleaned Username:", validator.clean_username())