# TextRPG

## Development Commands

### Frontend (Android)

**Install app to connected device** (run from root):
```bash
./gradlew :frontend:installDebug
```

**View device logs in real-time** (run from anywhere):
```bash
adb logcat
```
Filter for your app specifically:
```bash
adb logcat | grep -i textrpg
```

**List connected devices** (run from anywhere):
```bash
adb devices
```

### Backend

**Run backend server** (run from root):
```bash
./gradlew :backend:run
```

**Build backend** (run from root):
```bash
./gradlew :backend:build
```
