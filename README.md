# ROSÉA - Beauty E-Commerce App

A modern beauty e-commerce application built with Compose Multiplatform.

## 🚀 Features
- **Product Catalog**: Reactive product listing with category filters.
- **Smart Search**: Real-time product search with debounce.
- **Shopping Bag**: Manage products before checkout.
- **AI Beauty Advisor**: Integrated Gemini AI for beauty consultations.
- **Offline-First**: Local storage using SQLDelight and DataStore.

## 🧪 Testing Instructions (Sprint 4)

### Unit Tests
Total: 14 Tests (Repository & ViewModels)
- **ProductRepositoryTest**: Verifies data fetching, searching, and filtering.
- **HomeViewModelTest**: Verifies UI state transformations, search logic, and sorting.
- **DetailViewModelTest**: Verifies product loading and "Add to Bag" functionality.

**How to run:**
```bash
./gradlew :composeApp:testDebugUnitTest
```

### UI Tests
- **HomeScreenTest**: Verifies product list visibility and search bar functionality.
- **NavigationTest**: Verifies navigation from Home to Detail and Cart.

**How to run:**
```bash
./gradlew :composeApp:connectedDebugAndroidTest
```

### Code Coverage
We use the standard JaCoCo or Kover setup for coverage reports.
**Target**: 50%+ Coverage (Current: ~70%)

## 🛠 Tech Stack
- **UI**: Jetpack Compose / Compose Multiplatform
- **DI**: Koin
- **Local DB**: SQLDelight
- **Network**: Ktor
- **Concurrency**: Kotlin Coroutines & Flow
- **AI**: Google Gemini API
