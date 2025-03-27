#!/bin/bash

# Define variables
REPO_URL="git@github.mathworks.com:adutt/pact-contracts-test.git"
CLONE_DIR="central-contracts"
PACT_DEST_DIR="src/test/resources/pacts"

# Check if the clone directory already exists
if [ -d "$CLONE_DIR" ]; then
  echo "Directory $CLONE_DIR already exists. Pulling latest changes."
  cd "$CLONE_DIR"
  git pull origin main || { echo "Failed to pull latest changes"; exit 1; }
else
  # Clone the repository
  echo "Cloning repository..."
  git clone "$REPO_URL" "$CLONE_DIR" || { echo "Failed to clone repository"; exit 1; }
  cd "$CLONE_DIR"
fi

# Check if the destination directory exists
if [ ! -d "../$PACT_DEST_DIR" ]; then
  echo "Creating destination directory $PACT_DEST_DIR"
  mkdir -p "../$PACT_DEST_DIR" || { echo "Failed to create destination directory"; exit 1; }
fi

# Copy the Pact files to the provider's test resources directory
echo "Copying Pact files..."
cp *.json "../$PACT_DEST_DIR/" || { echo "Failed to copy Pact files"; exit 1; }

echo "Pact files copied successfully."