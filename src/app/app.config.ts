import { ApplicationConfig, importProvidersFrom } from '@angular/core';
import { provideRouter } from '@angular/router';

import { routes } from './app.routes';
import { provideClientHydration } from '@angular/platform-browser';
import { initializeApp, provideFirebaseApp } from '@angular/fire/app';
import { getAuth, provideAuth } from '@angular/fire/auth';
import { getFirestore, provideFirestore } from '@angular/fire/firestore';
import { getDatabase, provideDatabase } from '@angular/fire/database';
import { getFunctions, provideFunctions } from '@angular/fire/functions';

export const appConfig: ApplicationConfig = {
  providers: [provideRouter(routes), provideClientHydration(), importProvidersFrom(provideFirebaseApp(() => initializeApp({"projectId":"vox-choice-248","appId":"1:12399930142:web:87ed67b22e3d9e0451b70f","databaseURL":"https://vox-choice-248-default-rtdb.firebaseio.com","storageBucket":"vox-choice-248.appspot.com","apiKey":"AIzaSyDOuPf3Yylm-C9BZ2FzLU-yNI_PxVN7YfM","authDomain":"vox-choice-248.firebaseapp.com","messagingSenderId":"12399930142","measurementId":"G-CD1HP4KE2N"}))), importProvidersFrom(provideAuth(() => getAuth())), importProvidersFrom(provideFirestore(() => getFirestore())), importProvidersFrom(provideDatabase(() => getDatabase())), importProvidersFrom(provideFunctions(() => getFunctions()))]
};
