# 🌹 ROSÉA - Beauty E-Commerce App

## 👥 Informasi Tim
Proyek ini dikembangkan oleh:

| Nama | NIM | Peran | GitHub |
| :--- | :--- | :--- | :--- |
| **Andini Rahma Kemala** | 123140067 | Presentation Layer, UI/UX, Testing | [@Andinn](https://github.com/Andinn) |
| **Miftahul Khair** | 123140064 | Domain & Data Layer, Database, API | [@MIFTAAHULKHR](https://github.com/MIFTAAHULKHR) |

---

## 📝 Deskripsi Aplikasi
**ROSÉA** adalah platform e-commerce produk kecantikan yang dirancang menggunakan **Compose Multiplatform**. Aplikasi ini bertujuan untuk memberikan pengalaman berbelanja yang personal bagi pengguna dengan menghadirkan fitur **AI Beauty Advisor** yang didukung oleh Google Gemini, membantu pengguna menemukan produk yang paling sesuai dengan kebutuhan kulit mereka.

---

## ✨ Fitur Utama
- **Product Catalog**: Penjelajahan produk kecantikan dengan filter kategori yang responsif.
- **Smart Search**: Pencarian produk real-time menggunakan teknik *debounce* untuk efisiensi.
- **Shopping Bag**: Manajemen keranjang belanja yang intuitif sebelum melakukan checkout.
- **AI Beauty Advisor**: Konsultasi kecantikan cerdas terintegrasi dengan **Gemini AI**.
- **Offline-First**: Sinkronisasi data lokal menggunakan SQLDelight sehingga aplikasi tetap dapat diakses tanpa koneksi internet.

---

## 🛠 Tech Stack
- **Multiplatform Framework**: Compose Multiplatform (Android & iOS)
- **Dependency Injection**: Koin
- **Local Database**: SQLDelight
- **Networking**: Ktor Client
- **Local Storage**: Jetpack DataStore
- **Concurrency**: Kotlin Coroutines & Flow
- **AI Integration**: Google Gemini API

---

## 📐 Arsitektur
Aplikasi ini menerapkan **Clean Architecture** dengan pola **MVVM (Model-View-ViewModel)**:

- **Presentation Layer**: Mengelola UI dengan Compose dan UI State dengan ViewModels.
- **Domain Layer**: Berisi Business Logic, Model Domain, dan Interface Repository (Pure Kotlin).
- **Data Layer**: Implementasi Repository, integrasi SQLDelight (Lokal), dan Ktor (Remote).

---

## 🚀 Getting Started

1. **Clone Repository**
   ```bash
   git clone https://github.com/informatika-itera/Proyek-Pengembangan-Aplikasi-Mobile.git
   ```
2. **Setup API Key**
   - Buat file `local.properties` di root project.
   - Tambahkan API Key Gemini Anda: `GEMINI_API_KEY=AIzaSy...`
3. **Buka di Android Studio**
   - Gunakan **Android Studio Ladybug (2024.2.1)** atau versi terbaru.
   - Tunggu proses Gradle Sync selesai.
4. **Jalankan di Device**
   - Pilih modul `composeApp` dan jalankan di emulator atau perangkat fisik Android.

---

## 📥 Download
Tautan untuk mengunduh versi terbaru aplikasi:
- [**Download APK (Releases)**](https://github.com/informatika-itera/Proyek-Pengembangan-Aplikasi-Mobile/releases)

---

## Video Presentasi My Wallet 123140082-123140069
▶️ [Presentasi Akhir My-Wallet](https://www.youtube.com/watch?v=TB6eA-g8A2g)

---

## 🖼 Screenshots
| Home Screen | Product Detail | AI Advisor |
| :---: | :---: | :---: |
| <img src="https://github.com/user-attachments/assets/e913af67-8783-4a4a-893e-d349e9d9b4a0" width="200" /> | <img src="https://github.com/user-attachments/assets/4e27ed30-3d5a-4e86-87b4-d8e727c7b784" width="200" /> | <img src="https://github.com/user-attachments/assets/e913af67-8783-4a4a-893e-d349e9d9b4a0" width="200" /> |

---

<div align="center">
  <img src="https://github.com/user-attachments/assets/e913af67-8783-4a4a-893e-d349e9d9b4a0" width="100%" alt="ROSÉA Header" />
  <p><i>A modern beauty e-commerce application built with Compose Multiplatform.</i></p>
</div>

---
*Dokumen ini adalah bagian dari Proyek Pengembangan Aplikasi Mobile - ITERA.*
