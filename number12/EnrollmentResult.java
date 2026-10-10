package number12;

public sealed interface EnrollmentResult
        permits Accepted, Rejected, WaitListed, UnderReview {
}