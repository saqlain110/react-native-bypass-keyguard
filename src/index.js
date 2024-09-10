import {NativeModules} from 'react-native';

const LockMode = NativeModules.KeyguardModule;

export function BypassLockModeKeyguard() {
  return LockMode.showOverKeyguard();
}
export function ClearLockModeKeyguard() {
  return LockMode.clearShowOverKeyguard();
}
