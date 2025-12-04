# Java Socket Communication

Simple Java socket implementation for client-server communication without frameworks.

## Files
- `Server.java` - Socket server that relays messages between clients
- `Client.java` - Client that connects to server and sends/receives messages
- `run-server.bat` - Script to compile and start the server
- `run-client.bat` - Script to start a client

## Quick Start

1. **Start server:**
   ```
   run-server.bat
   ```

2. **Start clients** (in separate terminals):
   ```
   run-client.bat
   ```

3. **Test:** Type messages in any client - they appear in all other clients

## Manual Commands

```bash
# Compile
javac *.java

# Run server
java Server

# Run client
java Client
```

## How it works
- Server listens on port 8080
- Clients connect and can send messages
- Server broadcasts messages to all connected clients
- Multiple clients can communicate through the server