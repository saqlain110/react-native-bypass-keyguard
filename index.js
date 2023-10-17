import {NativeModules} from 'react-native';

const LockMode = NativeModules.KeyguardModule;

class LockScreenMode {
  constructor() {
    console.log('ITS RUNNINGGGG');
    super(LockMode);
  }

  BypassLockModeKeyguard() {
    return LockMode.showOverKeyguard();
  }

  ClearLockModeKeyguard() {
    return LockMode.clearShowOverKeyguard();
  }
}
export default new LockScreenMode();
