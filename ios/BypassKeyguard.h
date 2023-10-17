
#ifdef RCT_NEW_ARCH_ENABLED
#import "RNBypassKeyguardSpec.h"

@interface BypassKeyguard : NSObject <NativeBypassKeyguardSpec>
#else
#import <React/RCTBridgeModule.h>

@interface BypassKeyguard : NSObject <RCTBridgeModule>
#endif

@end
