
package number15;

public sealed interface RuleResult
        permits RulePassed, RuleFailed {

    String message();
}
