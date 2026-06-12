# ROSÉA - Beauty E-Commerce App

ROSÉA is a modern, elegant, and high-performance beauty e-commerce application built using **Compose Multiplatform**. It offers a seamless shopping experience with a "Soft Rose" aesthetic, integrated AI assistance, and offline-first capabilities.

## ✨ Features

- **🌸 Elegant UI/UX**: Custom "Soft Rose" theme with support for **Dark Mode**.
- **🛍️ Product Catalog**: Browse various beauty products with real-time category filtering.
- **🔍 Smart Search**: Instant search results powered by reactive state management.
- **🤖 AI Beauty Advisor**: Get personalized beauty tips using the integrated **Google Gemini AI**.
- **🛒 Seamless Cart**: Manage your shopping bag easily before checkout.
- **🌓 Dynamic Theme**: Toggle between Light and Dark mode via Settings.
- **📦 Offline-First**: Reliable data access using **SQLDelight** and **DataStore** even without internet.
- **✨ Animated Banner**: Engaging home banner with floating effects and shimmering gradients.

## 🛠 Tech Stack

- **UI Framework**: Compose Multiplatform (Android/iOS)
- **Dependency Injection**: Koin
- **Networking**: Ktor
- **Database**: SQLDelight (Local persistence)
- **Local Preferences**: DataStore
- **Image Loading**: Coil 3
- **AI Integration**: Google Gemini API
- **Navigation**: Compose Navigation

## 🚀 Getting Started

### Prerequisites
- Android Studio Ladybug or newer.
- JDK 17.
- Gemini API Key (for AI features).

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/username/rosea.git
   ```
2. Open the project in Android Studio.
3. Add your `GEMINI_API_KEY` in `local.properties`:
   ```properties
   GEMINI_API_KEY=your_key_here
   ```
4. Sync Gradle and run the `:composeApp` on an emulator or device.

## 🧪 Testing

### Running Unit Tests
```bash
./gradlew :composeApp:testDebugUnitTest
```

### Running UI Tests
```bash
./gradlew :composeApp:connectedDebugAndroidTest
```

## 📱 Screenshots

| Home (Light) | Home (Dark) | Settings | AI Advisor |
|--------------|-------------|----------|------------|
| ![Home](docs/screenshots/home_light.png) | ![Home Dark](docs/screenshots/home_dark.png) | ![Settings](docs/screenshots/settings.png) | ![AI](docs/screenshots/ai_advisor.png) |

---
*Developed for Proyek Pengembangan Aplikasi Mobile - Sprint 5*
